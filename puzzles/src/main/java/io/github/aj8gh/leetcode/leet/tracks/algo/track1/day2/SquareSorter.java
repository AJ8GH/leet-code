package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day2;

import static java.util.Arrays.stream;

public class SquareSorter {

  public int[] sortedSquares(int[] nums) {
    return stream(nums)
        .map(n -> (int) Math.pow(n, 2))
        .sorted()
        .toArray();
  }
}
