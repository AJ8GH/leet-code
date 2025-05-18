package io.github.aj8gh.leetcode.neet.neetcode150.blind75.trees.easy;

import io.github.aj8gh.leetcode.model.TreeNode;
import java.util.ArrayDeque;

public class MaximumDepthOfBinaryTree {

  public int solve(TreeNode root) {
    if (root == null) {
      return 0;
    }
    var nodes = new ArrayDeque<TreeNode>();
    nodes.addLast(root);
    var depth = 0;

    while (!nodes.isEmpty()) {
      depth++;
      var numNodes = nodes.size();
      for (int i = 0; i < numNodes; i++) {
        var node = nodes.pop();
        if (node.left != null) {
          nodes.addLast(node.left);
        }

        if (node.right != null) {
          nodes.addLast(node.right);
        }
      }
    }
    return depth;
  }
}
