package io.github.aj8gh.leetcode.blind75.easy.twosum;

public class Solution {

  public int[] solve(int[] nums, int target) {
    for (var i = 0; i < nums.length; i++) {
      for (var j = i + 1; j < nums.length; j++) {
        if (i != j && nums[i] + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {};
  }
}
