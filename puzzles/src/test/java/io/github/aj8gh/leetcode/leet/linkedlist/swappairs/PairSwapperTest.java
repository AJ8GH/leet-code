package io.github.aj8gh.leetcode.leet.linkedlist.swappairs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.model.ListNode;
import io.github.aj8gh.leetcode.test.AbstractListNodeTest;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PairSwapperTest extends AbstractListNodeTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(toListNode(1, 2, 3, 4), toListNode(2, 1, 4, 3))
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void swapPairs(ListNode head, ListNode expected) {
    var pairSwapper = new PairSwapper();
    var actual = pairSwapper.swapPairs(head);
    assertEquals(expected.toList(), actual.toList());
  }
}
