package io.github.aj8gh.leetcode.blind75.medium.topkfrequentelements;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Solution {

  public int[] solve(int[] nums, int k) {
    return Arrays.stream(nums)
        .boxed()
        .collect(Collectors.groupingBy(key -> key, Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
        .map(Entry::getKey)
        .limit(k)
        .mapToInt(Integer::intValue)
        .toArray();
  }
}
