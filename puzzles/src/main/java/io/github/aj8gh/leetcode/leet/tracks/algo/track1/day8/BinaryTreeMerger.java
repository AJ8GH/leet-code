package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day8;


import io.github.aj8gh.leetcode.model.TreeNode;

public class BinaryTreeMerger {

  public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null) {
      return null;
    }

    var mergeTree = new TreeNode();
    merge(root1, root2, mergeTree, null, "");
    return mergeTree;
  }

  private void merge(TreeNode root1, TreeNode root2, TreeNode mergeTree, TreeNode parent,
      String side) {
    if (root1 == null && root2 == null) {
      if (side.equals("L")) {
        parent.left = null;
      } else {
        parent.right = null;
      }
      return;
    }

    if (root1 == null) {
      mergeTree.val = root2.val;
      if (root2.left != null) {
        mergeTree.left = new TreeNode();
        merge(root1, root2.left, mergeTree.left, mergeTree, "L");
      }
      if (root2.right != null) {
        mergeTree.right = new TreeNode();
        merge(root1, root2.right, mergeTree.right, mergeTree, "R");
      }
    } else if (root2 == null) {
      mergeTree.val = root1.val;
      if (root1.left != null) {
        mergeTree.left = new TreeNode();
        merge(root1.left, root2, mergeTree.left, mergeTree, "L");
      }
      if (root1.right != null) {
        mergeTree.right = new TreeNode();
        merge(root1.right, root2, mergeTree.right, mergeTree, "R");
      }
    } else {
      mergeTree.val = root1.val + root2.val;
      mergeTree.left = new TreeNode();
      mergeTree.right = new TreeNode();
      merge(root1.left, root2.left, mergeTree.left, mergeTree, "L");
      merge(root1.right, root2.right, mergeTree.right, mergeTree, "R");
    }
  }
}
