package io.github.aj8gh.leetcode.linkedlist.swapnodes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.linkedlist.AbstractListNodeTest;
import io.github.aj8gh.leetcode.linkedlist.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NodeSwapperTest extends AbstractListNodeTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(
            toListNode(1, 2, 3, 4, 5), 2,
            toListNode(1, 4, 3, 2, 5)
        ),
        Arguments.of(
            toListNode(7, 9, 6, 6, 7, 8, 3, 0, 9, 5), 5,
            toListNode(7, 9, 6, 6, 8, 7, 3, 0, 9, 5)
        ),
        Arguments.of(
            toListNode(1), 1,
            toListNode(1)
        ),
        Arguments.of(
            toListNode(1, 2), 1,
            toListNode(2, 1)
        )
    );
  }

  @Disabled
  @ParameterizedTest
  @MethodSource("inputProvider")
  void swapNodes(ListNode head, int k, ListNode expectedOutput) {
    var nodeSwapper = new NodeSwapper();
    var actualOutput = nodeSwapper.swapNodes(head, k);
    assertEquals(expectedOutput, actualOutput);
  }
}
