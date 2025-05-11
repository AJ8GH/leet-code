package io.github.aj8gh.leetcode.blind75.arraysandhashing.medium.productsofarrayexceptself;

import java.util.Arrays;

public class Solution {

  public int[] solve(int[] nums) {
    var product = 1;
    var numZeroes = 0;
    for (var n : nums) {
      if (n == 0) {
        numZeroes++;
      } else {
        product *= n;
      }
    }

    var out = new int[nums.length];
    if (numZeroes > 1) {
      Arrays.fill(out, 0);
      return out;
    }

    for (var i = 0; i < nums.length; i++) {
      var n = nums[i];
      if (n == 0) {
        out[i] = product;
      } else if (numZeroes == 1) {
        out[i] = 0;
      } else {
        out[i] = product / n;
      }
    }

    return out;
  }
}
