package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.twopointers.medium.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {

  public List<List<Integer>> solve(int[] nums) {
    var out = new HashSet<List<Integer>>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      var n = nums[i];
      var target = -n;
      var j = i + 1;
      var k = nums.length - 1;

      while (j < k) {
        var sum = nums[j] + nums[k];
        while (j < k && sum < target) {
          sum = nums[++j] + nums[k];
        }
        while (j < k && sum > target) {
          sum = nums[j] + nums[--k];
        }
        if (j < k && sum == target) {
          out.add(List.of(n, nums[j], nums[k]));
          j++;
          k--;
        }
      }
    }

    return new ArrayList<>(out);
  }
}
