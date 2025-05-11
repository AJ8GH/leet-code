package io.github.aj8gh.leetcode.blind75.medium.longestconsecutivesequence;

import java.util.TreeSet;

public class Solution {

  public record Range(
      int high,
      int low
  ) {

  }

  public int solve(int[] nums) {
    // [2,20,4,10,3,4,5]
    // [2, 2]
    // [2, 2] [20, 20]
    // [2, 2] [20, 20] [4, 4]
    // [2, 2] [20, 20] [4, 4] [10, 10]
    // [2, 3] [20, 20] [4, 4] [10, 10]
    // [2, 3] [20, 20] [4, 4] [10, 10]
    // [2, 3, 4] [20, 20] [4, 4] [10, 10]
    // [2, 3, 4, 5] [20, 20] [4, 4] [10, 10]

    //var ranges = TreeSet<Integer>
    for (var n : nums) {


    }

    return 0;
  }
}
