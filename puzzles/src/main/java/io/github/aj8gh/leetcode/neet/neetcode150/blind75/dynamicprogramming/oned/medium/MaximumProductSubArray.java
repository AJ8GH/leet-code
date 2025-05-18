package io.github.aj8gh.leetcode.neet.neetcode150.blind75.dynamicprogramming.oned.medium;

public class MaximumProductSubArray {

  public int solve(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    var product = 0;
    var maxProduct = nums[0];
    var allProduct = 1;
    var numNegs = 0;
    var firstNeg = -1;
    var lastNeg = -1;

    for (var i = 0; i < nums.length; i++) {
      var n = nums[i];
      if (n < 0) {
        numNegs++;
        if (firstNeg == -1) {
          firstNeg = i;
        }
        lastNeg = i;
      }
      product = Math.max(n, product * n);
      maxProduct = Math.max(product, maxProduct);
      allProduct *= n;
      maxProduct = Math.max(maxProduct, allProduct);
    }

    var preNegMax = 0;
    var postNegMax = 0;
    if (numNegs % 2 != 0) {
      for (var i = 0; i < nums.length; i++) {
        if (i < lastNeg) {
          if (i == 0) {
            preNegMax = nums[i];
          } else {
            preNegMax *= nums[i];
          }
        }

        if (i > firstNeg) {
          if (i == firstNeg + 1) {
            postNegMax = nums[i];
          } else {
            postNegMax *= nums[i];
          }
        }
      }
    }

    var negMax = Math.max(preNegMax, postNegMax);
    return Math.max(negMax, maxProduct);
  }
}
