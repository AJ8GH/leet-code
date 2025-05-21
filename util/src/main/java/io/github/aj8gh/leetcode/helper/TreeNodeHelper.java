package io.github.aj8gh.leetcode.helper;

import io.github.aj8gh.leetcode.model.TreeNode;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TreeNodeHelper {

  public static TreeNode tn(int val) {
    return new TreeNode(val);
  }

  public static TreeNode tn(int val, TreeNode left, TreeNode right) {
    return new TreeNode(val, left, right);
  }
}
