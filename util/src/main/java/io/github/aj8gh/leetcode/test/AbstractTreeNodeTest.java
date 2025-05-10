package io.github.aj8gh.leetcode.test;

import io.github.aj8gh.leetcode.model.TreeNode;

public class AbstractTreeNodeTest {

  protected static TreeNode tn(int val) {
    return new TreeNode(val);
  }

  protected static TreeNode tn(int val, TreeNode left, TreeNode right) {
    return new TreeNode(val, left, right);
  }
}
