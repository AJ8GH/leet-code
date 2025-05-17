package io.github.aj8gh.leetcode.neet.neetcode150.blind75.greedy.medium;

public class MaximumSubArray {

  public int solve(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    int iSum = 0, jSum = 0;
    for (int i = 0, j = nums.length - 1; i <= j; i++, j--) {
      iSum = Math.max(iSum + nums[i], nums[i]);
      if (i != j) {
        jSum = Math.max(jSum + nums[j], nums[j]);
      }
    }

    var max = Math.max(iSum, jSum);
    return Math.max(max, iSum + jSum);
  }
}
