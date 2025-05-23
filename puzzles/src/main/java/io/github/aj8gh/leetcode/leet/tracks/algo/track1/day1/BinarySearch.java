package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day1;

public class BinarySearch {

  public int search(int[] nums, int target) {
    int upper = nums.length - 1;
    int lower = 0;

    if (nums[upper] == target) {
      return upper;
    } else if (nums[lower] == target) {
      return lower;
    }

    while (upper - lower > 1) {
      int mid = lower + ((upper - lower) / 2);
      if (nums[mid] == target) {
        return mid;
      }
      upper = nums[mid] > target ? mid : upper;
      lower = nums[mid] < target ? mid : lower;
    }
    return -1;
  }
}
