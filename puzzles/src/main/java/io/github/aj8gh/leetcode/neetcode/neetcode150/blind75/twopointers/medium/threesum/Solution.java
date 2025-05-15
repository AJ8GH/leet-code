package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.twopointers.medium.threesum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

  public List<List<Integer>> solve(int[] nums) {
    var twoSumsToIndices = new HashMap<Integer, Set<Set<Integer>>>();
    for (var i = 0; i < nums.length; i++) {
      for (var j = i + 1; j < nums.length; j++) {
        if (i == j) {
          continue;
        }
        var twoSum = nums[i] + nums[j];
        var sets = twoSumsToIndices.computeIfAbsent(twoSum, key -> new HashSet<>());
        sets.add(new HashSet<>(Set.of(i, j)));
      }
    }

    var out = new HashSet<Set<Integer>>();
    for (var i = 0; i < nums.length; i++) {
      var n = nums[i];
      var diff = -n;
      var sets = twoSumsToIndices.get(diff);
      if (sets == null) {
        continue;
      }
      for (var s : sets) {
        if (s.size() != 3 && !s.contains(i)) {
          s.add(i);
          out.add(s);
        }
      }
    }
    return out.stream()
        .map(s -> s.stream()
            .map(i -> nums[i])
            .sorted()
            .toList())
        .distinct()
        .toList();
  }
}
