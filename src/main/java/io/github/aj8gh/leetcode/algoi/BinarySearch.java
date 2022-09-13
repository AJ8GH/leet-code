package io.github.aj8gh.leetcode.algoi;

public class BinarySearch {

  public int search(int[] nums, int target) {
    var upper = nums.length - 1;
    var lower = 0;
    var mid = nums.length / 2;
    do {
      if (nums[mid] == target) {
        return mid;
      }

      if (nums[mid] > target) {
        upper = mid;
      } else if (nums[mid] < target) {
        lower = mid;
      }
      mid = lower + ((upper - lower) / 2) ;
    } while (upper - lower > 1);

    if (nums[upper] == target) {
      return upper;
    } else if (nums[lower] == target) {
      return lower;
    }
    return -1;
  }
}
