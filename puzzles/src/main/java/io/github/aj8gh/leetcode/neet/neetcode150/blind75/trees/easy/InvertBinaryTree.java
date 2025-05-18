package io.github.aj8gh.leetcode.neet.neetcode150.blind75.trees.easy;

import io.github.aj8gh.leetcode.model.TreeNode;
import java.util.ArrayDeque;

public class InvertBinaryTree {

  public TreeNode solve(TreeNode root) {
    var nodes = new ArrayDeque<TreeNode>();
    nodes.addLast(root);

    while (!nodes.isEmpty()) {
      var node = nodes.pop();
      var left = node.left;
      node.left = node.right;
      node.right = left;

      if (node.left != null) {
        nodes.addLast(node.left);
      }

      if (node.right != null) {
        nodes.addLast(node.right);
      }
    }

    return root;
  }

  public TreeNode solveRecursively(TreeNode root) {
    if (root == null) {
      return null;
    }

    var right = root.right;
    root.right = root.left;
    root.left = right;
    solveRecursively(root.left);
    solveRecursively(root.right);

    return root;
  }
}
