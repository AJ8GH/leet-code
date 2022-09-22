package io.github.aj8gh.leetcode.linkedlist.removenthnode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.linkedlist.AbstractListNodeTest;
import io.github.aj8gh.leetcode.linkedlist.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NodeRemoverTest extends AbstractListNodeTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(toListNode(1), 1, toListNode()),
        Arguments.of(toListNode(1, 2), 1, toListNode(1)),
        Arguments.of(toListNode(1, 2, 3, 4, 5), 2, toListNode(1, 2, 3, 5)),
        Arguments.of(toListNode(1, 2), 2, toListNode(2))
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void removeNthNodeFromEnd(ListNode head, int n, ListNode expectedOutput) {
    var nodeRemover = new NodeRemover();
    var actualOutput = nodeRemover.removeNthFromEnd(head, n);
    assertEquals(expectedOutput, actualOutput);
  }
}
