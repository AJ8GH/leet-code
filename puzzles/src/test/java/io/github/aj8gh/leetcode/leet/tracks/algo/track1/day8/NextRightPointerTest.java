package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.model.Node;
import org.junit.jupiter.api.Test;

class NextRightPointerTest {

  @Test
  void connect() {
    var expected = node(1);
    var left = node(2);
    expected.left = left;
    var right = node(3);
    expected.right = right;
    var leftRight = node(5);
    expected.left.right = leftRight;
    var rightLeft = node(6);
    expected.right.left = rightLeft;
    var rightRight = node(7);
    expected.right.right = rightRight;
    left.next = right;
    expected.left.left = node(4);
    left.left.next = leftRight;
    left.right.next = rightLeft;
    right.left.next = rightRight;

    var input = node(1, node(2, node(4), node(5)), node(3, node(6), node(7)));
    var nextRightPointer = new NextRightPointer();
    var actual = nextRightPointer.connect(input);
    assertEquals(expected, actual);
  }

  private static Node node(int val) {
    return new Node(val);
  }

  private static Node node(int val, Node left, Node right) {
    return new Node(val, left, right, null);
  }
}
