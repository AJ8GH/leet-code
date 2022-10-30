package io.github.aj8gh.leetcode.binarytree.validbst;

import io.github.aj8gh.leetcode.domain.TreeNode;

public class BstValidator {
  public boolean isValidBst(TreeNode root) {
    if (getMinRight(root) > root.val) {
      return false;
    }
    return getMaxLeft(root) < root.val;
  }

  private int getMinRight(TreeNode node) {
    int min = node.val;
    while (node.left != null) {
      if (node.left.val < min) {
        min = node.left.val;
      }
    }
    return 0;
  }

  private int getMaxLeft(TreeNode node) {
    return 0;
  }
}
