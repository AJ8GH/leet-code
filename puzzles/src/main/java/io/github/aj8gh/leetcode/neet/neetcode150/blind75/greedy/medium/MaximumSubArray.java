package io.github.aj8gh.leetcode.neet.neetcode150.blind75.greedy.medium;

public class MaximumSubArray {

  public int solve(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    int sum = 0;
    int max = nums[0];
    for (int num : nums) {
      sum = Math.max(sum + num, num);
      max = Math.max(sum, max);
    }

    return max;
  }
}
