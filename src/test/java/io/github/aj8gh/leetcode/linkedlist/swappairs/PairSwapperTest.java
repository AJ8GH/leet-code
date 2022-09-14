package io.github.aj8gh.leetcode.linkedlist.swappairs;

import static org.junit.jupiter.api.Assertions.*;

import io.github.aj8gh.leetcode.linkedlist.AbstractListNodeTest;
import io.github.aj8gh.leetcode.linkedlist.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PairSwapperTest extends AbstractListNodeTest {
  protected PairSwapper pairSwapper;

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(toListNode(1, 2, 3, 4), toListNode(2, 1, 4, 3))
    );
  }

  @BeforeEach
  void setUp() {
    pairSwapper = new PairSwapper();
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void swapPairs(ListNode head, ListNode expectedOutput) {
    var actualOutput = pairSwapper.swapPairs(head);
    assertEquals(expectedOutput, actualOutput);
  }
}
