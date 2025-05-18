package io.github.aj8gh.leetcode.neet.neetcode150.blind75.dynamicprogramming.onedimention.medium;

public class MaximumProductSubArray {

  public int solve(int[] nums) {
    var maxProduct = nums[0];
    var minProduct = 1;
    var currentProduct = 1;

    for (int n : nums) {
      var currentByN = currentProduct * n;
      currentProduct = Math.max(n, Math.max(currentProduct * n, minProduct * n));
      minProduct = Math.min(n, Math.min(currentByN, minProduct * n));
      maxProduct = Math.max(maxProduct, currentProduct);
    }

    return maxProduct;
  }
}
