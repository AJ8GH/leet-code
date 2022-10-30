package io.github.aj8gh.leetcode.binarytree.inordertraversal;

import io.github.aj8gh.leetcode.domain.TreeNode;
import java.util.ArrayList;
import java.util.List;

class Traverser {
  private final List<Integer> values = new ArrayList<>();

  public List<Integer> inorderTraversal(TreeNode root) {
    if (root != null) {
      traverseLeft(root.left);
      values.add(root.val);
      traverseRight(root.right);
    }
    return values;
  }

  private void traverseLeft(TreeNode leftNode) {
    if (leftNode == null) return;
    traverseLeft(leftNode.left);
    values.add(leftNode.val);
    traverseRight(leftNode.right);
  }

  private void traverseRight(TreeNode rightNode) {
    if (rightNode == null) return;
    traverseLeft(rightNode.left);
    values.add(rightNode.val);
    traverseRight(rightNode.right);
  }
}
