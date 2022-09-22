package io.github.aj8gh.leetcode.algo.track1.day1;

public class InsertSearcher {

  public int searchInsert(int[] nums, int target) {
    int lower = 0;
    int upper = nums.length - 1;

    if (nums[upper] < target) {
      return upper + 1;
    } else if (nums[upper] == target) {
      return upper;
    } else if (nums[lower] >= target) {
      return lower;
    }

    while (upper - lower > 1) {
      int mid = lower + ((upper - lower) / 2);
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        lower = mid;
      } else {
        upper = mid;
      }
    }
    return upper;
  }
}
