package io.github.aj8gh.leetcode.neet.neetcode150.blind75.arraysandhashing.easy;

import java.util.HashSet;

public class ContainsDuplicate {

  public boolean solve(int[] nums) {
    var found = new HashSet<Integer>();
    for (var n : nums) {
      if (found.contains(n)) {
        return true;
      }
      found.add(n);
    }
    return false;
  }
}
