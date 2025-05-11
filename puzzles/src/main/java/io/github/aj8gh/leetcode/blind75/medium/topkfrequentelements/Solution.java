package io.github.aj8gh.leetcode.blind75.medium.topkfrequentelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

  public int[] solve(int[] nums, int k) {
    var bucketSort = new ArrayList<List<Integer>>();

    IntStream
        .range(0, nums.length)
        .forEach(n -> bucketSort.add(new ArrayList<>()));

    Arrays.stream(nums)
        .boxed()
        .collect(Collectors.groupingBy(key -> key, Collectors.counting()))
        .forEach((key, value) -> bucketSort.get(value.intValue() - 1).add(key));

    var out = new int[k];
    for (int i = nums.length - 1; i >= 0; i--) {
      var group = bucketSort.get(i);
      for (var val : group) {
        k--;
        out[k] = val;
        if (k == 0) {
          return out;
        }
      }
    }

    return out;
  }
}
