package io.github.aj8gh.leetcode.algos.algoii;

import static java.util.Arrays.stream;

public class SquareSorter {
  public int[] sortedSquares(int[] nums) {
    return stream(nums)
        .map(n -> (int) Math.pow(n, 2))
        .sorted()
        .toArray();
  }
}
