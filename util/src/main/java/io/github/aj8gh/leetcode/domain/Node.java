package io.github.aj8gh.leetcode.domain;

import java.util.Objects;

public class Node {
  public int val;
  public Node left;
  public Node right;
  public Node next;

  public Node() {}

  public Node(int _val) {
    val = _val;
  }

  public Node(int _val, Node _left, Node _right, Node _next) {
    val = _val;
    left = _left;
    right = _right;
    next = _next;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return val == node.val && Objects.equals(left, node.left) && Objects.equals(
        right, node.right) && Objects.equals(next, node.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, left, right, next);
  }

  @Override
  public String toString() {
    return val + "," + left + "," + right + "," + next;
  }
}
