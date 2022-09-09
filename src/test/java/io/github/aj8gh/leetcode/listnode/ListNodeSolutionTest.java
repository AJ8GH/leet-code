package io.github.aj8gh.leetcode.listnode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ListNodeSolutionTest {
  private Solution solution;

  @BeforeEach
  void setUp() {
    solution = new Solution();
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void addTwoNumbers(ListNode l1, ListNode l2, ListNode expected) {
    var actual = solution.addTwoNumbers(l1, l2);
    assertEquals(expected, actual);
  }

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(
            toListNode(2, 4, 3),
            toListNode(5, 6, 4),
            toListNode(7, 0, 8)
        ),
        Arguments.of(
            toListNode(9),
            toListNode(1, 9, 9, 9, 9, 9, 9, 9, 9, 9),
            toListNode(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1)
        ),
        Arguments.of(
            toListNode(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
            toListNode(5, 6, 4),
            toListNode(6, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1)
        )
    );
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
}
