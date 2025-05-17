package io.github.aj8gh.leetcode.tracks.algo.track1.day5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.model.ListNode;
import io.github.aj8gh.leetcode.test.AbstractListNodeTest;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MiddleNodeFinderTest extends AbstractListNodeTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(
            toListNode(1, 2, 3, 4, 5),
            toListNode(3, 4, 5)
        ),
        Arguments.of(
            toListNode(1, 2, 3, 4, 5, 6),
            toListNode(4, 5, 6)
        )
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void middleNode(ListNode head, ListNode expected) {
    var middleNodeFinder = new MiddleNodeFinder();
    var actual = middleNodeFinder.middleNode(head);
    assertEquals(expected.toList(), actual.toList());
  }
}
