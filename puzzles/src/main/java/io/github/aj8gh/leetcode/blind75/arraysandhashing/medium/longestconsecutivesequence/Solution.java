package io.github.aj8gh.leetcode.blind75.arraysandhashing.medium.longestconsecutivesequence;

import java.util.TreeSet;

public class Solution {

  public int solve(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }

    var sorted = new TreeSet<Integer>();

    for (var n : nums) {
      sorted.add(n);
    }

    var max = 1;
    var currentMax = 1;

    var i = sorted.iterator();
    var current = i.next();
    while (i.hasNext()) {
      var next = i.next();
      if (next - current == 1) {
        currentMax++;
        if (currentMax > max) {
          max = currentMax;
        }
      } else if (next - current > 1) {
        currentMax = 1;
      }

      current = next;
    }

    return max;
  }
}
