package io.github.aj8gh.leetcode.blind75.easy.containsduplicate;

import java.util.HashSet;

public class Solution {

  public boolean hasDuplicate(int[] nums) {
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
