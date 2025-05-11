package io.github.aj8gh.leetcode.blind75.arraysandhashing.medium.longestconsecutivesequence;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

  public int solveRefactored(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }

    var set = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toSet());

    var maxSequence = 1;
    for (var n : nums) {
      if (!set.contains(n - 1)) {
        var current = n;
        var currentSequence = 1;
        while (set.contains(current + 1)) {
          currentSequence++;
          current++;
        }
        maxSequence = Math.max(currentSequence, maxSequence);
      }
    }
    return maxSequence;
  }

  public int solve(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }

    var set = new HashSet<Integer>();
    for (var n : nums) {
      set.add(n);
    }

    var groups = new HashMap<Integer, Set<Integer>>();
    for (var n : set) {
      groupNeighbours(set, groups, n, n - 1);
      groupNeighbours(set, groups, n, n + 1);
    }

    return groups.values()
        .stream()
        .map(Set::size)
        .max(Comparator.naturalOrder())
        .orElse(0);
  }

  private void groupNeighbours(
      Set<Integer> set,
      Map<Integer, Set<Integer>> groups,
      int num,
      int neighbour
  ) {
    if (set.contains(neighbour)) {
      var group = groups.getOrDefault(num, groups.computeIfAbsent(neighbour, key -> new HashSet<>()));
      group.add(num);
      group.add(neighbour);
      groups.put(num, group);
      groups.put(neighbour, group);
    }
  }
}
