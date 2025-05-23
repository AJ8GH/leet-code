package io.github.aj8gh.leetcode.neet.neetcode150.blind75.arraysandhashing.easy;

import java.util.HashMap;

public class TwoSum {

  public int[] solve(int[] nums, int target) {
    var map = new HashMap<Integer, Integer>();
    for (var i = 0; i < nums.length; i++) {
      var n = nums[i];
      var diff = target - n;
      if (map.containsKey(diff)) {
        return new int[] {i, map.get(diff)};
      }
      map.put(n, i);
    }
    return new int[] {};
  }
}
