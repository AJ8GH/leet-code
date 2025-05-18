package io.github.aj8gh.leetcode.model;

import java.util.ArrayDeque;
import java.util.Objects;

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  public static TreeNode from(int... nums) {
    if (nums == null || nums.length == 0) {
      return null;
    }

    var head = new TreeNode(nums[0]);
    var nodes = new ArrayDeque<TreeNode>();
    nodes.addLast(head);
    var i = 1;
    while (!nodes.isEmpty() && i < nums.length) {
      var node = nodes.pop();
      var leftVal = nums[i++];
      node.left = new TreeNode(leftVal);
      nodes.addLast(node.left);
      if (i < nums.length) {
        var rightVal = nums[i++];
        node.right = new TreeNode(rightVal);
        nodes.addLast(node.right);
      }
    }

    return head;
  }

  public TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return val + "," + left + "," + right;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    return o instanceof TreeNode tn
        && val == tn.val
        && Objects.equals(left, tn.left)
        && Objects.equals(right, tn.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, left, right);
  }
}
