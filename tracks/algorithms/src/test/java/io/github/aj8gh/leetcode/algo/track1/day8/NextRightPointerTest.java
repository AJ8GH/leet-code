package io.github.aj8gh.leetcode.algo.track1.day8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.domain.Node;
import org.junit.jupiter.api.Test;

class NextRightPointerTest {

  @Test
  void connect() {
    var input = n(1, n(2, n(4), n(5)), n(3, n(6), n(7)));
    var expected = n(1);
    var left = n(2);
    var right = n(3);
    var leftLeft = n(4);
    var leftRight = n(5);
    var rightLeft = n(6);
    var rightRight = n(7);
    expected.left = left;
    expected.right = right;
    expected.left.left = leftLeft;
    expected.left.right = leftRight;
    expected.right.left = rightLeft;
    expected.right.right = rightRight;
    left.next = right;
    left.left.next = leftRight;
    left.right.next = rightLeft;
    right.left.next = rightRight;

    var nextRightPointer = new NextRightPointer();
    var actual = nextRightPointer.connect(input);
    assertEquals(expected, actual);
  }

  private static Node n(int val) {
    return new Node(val);
  }

  private static Node n(int val, Node left, Node right) {
    return new Node(val, left, right, null);
  }

  private static Node n(int val, Node left, Node right, Node next) {
    return new Node(val, left, right, next);
  }
}
