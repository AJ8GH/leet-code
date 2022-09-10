package io.github.aj8gh.leetcode.linkedlist.removenthnode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NodeRemoverTest {
  private NodeRemover nodeRemover;

  private static Stream<Arguments> inputProvider() {
    return Stream.of(Arguments.of(toListNode(1, 2, 3, 4, 5), 2, toListNode(1, 2, 3, 5)),
        Arguments.of(toListNode(1), 1, new ListNode()),
        Arguments.of(toListNode(1, 2), 1, toListNode(1)));
  }

  private static ListNode toListNode(int... digits) {
    ListNode node = new ListNode();
    ListNode currentNode = node;
    for (int i = 0; i < digits.length; i++) {
      currentNode.val = digits[i];
      if (i < digits.length - 1) {
        currentNode.next = new ListNode();
        currentNode = currentNode.next;
      }
    }
    return node;
  }

  @BeforeEach
  void setUp() {
    nodeRemover = new NodeRemover();
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void addTwoNumbers(ListNode head, int n, ListNode expectedOutput) {
    var actualOutput = nodeRemover.removeNthFromEnd(head, n);
    assertEquals(expectedOutput, actualOutput);
  }
}
