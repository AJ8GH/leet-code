package io.github.aj8gh.leetcode.algo.track1.day8;

import io.github.aj8gh.leetcode.domain.Node;

public class NextRightPointer {

  public Node connect(Node root) {
    if (root == null) {
      return null;
    }

    var left = root.left;
    var right = root.right;

    setNext(left, right);

    return root;
  }

  private void setNext(Node left, Node right) {
    if (left != null) {
      left.next = right;
      setNext(left.left, left.right);
      if (right != null) {
        setNext(left.right, right.left);
      }
    }
    if (right != null) {
      setNext(right.left, right.right);
    }
  }
}
