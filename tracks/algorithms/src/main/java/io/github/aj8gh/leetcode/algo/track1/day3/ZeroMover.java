package io.github.aj8gh.leetcode.algo.track1.day3;

public class ZeroMover {
  public void moveZeroes(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int j = i + 1;
      int num = nums[i];
      if (num == 0 && j < nums.length) {
        int next = nums[j];
        while (next == 0 && j < nums.length - 1) {
          next = nums[++j];
        }
        nums[i] = nums[j];
        nums[j] = 0;
      }
    }
  }
}
