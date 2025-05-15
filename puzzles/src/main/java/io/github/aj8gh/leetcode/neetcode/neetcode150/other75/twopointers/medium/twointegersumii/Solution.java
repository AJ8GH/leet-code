package io.github.aj8gh.leetcode.neetcode.neetcode150.other75.twopointers.medium.twointegersumii;

public class Solution {

  public int[] solve(int[] numbers, int target) {

    /*

      [1, 2, 3, 4] 3
      [1, 2]

      [1, 3, 4, 7, 8, 10, 12, 15] 14
      [4, 10]

     */

    for (int i = 0; i < numbers.length; i++) {
      var n = numbers[i];
      var diff = target - n;

      if (diff > n) {
        var found = find(numbers, i+1, numbers.length - 1, diff);
        if (found >= 0) {
          return new int[] {i + 1, found + 1};
        }
      }

      if (diff < n) {
        var found = find(numbers, 0, i - 1, diff);
        if (found >= 0) {
          return new int[] {i + 1, found + 1};
        }
      }
    }

    return numbers;
  }

  private int find(int[] nums, int i, int j, int target) {
    while (j - i > -1) {
      if (nums[i] == target) {
        return i;
      }
      if (nums[j] == target) {
        return j;
      }
      var index = (j - i) / 2 + i;
      var result = nums[index];
      if (result == target) {
        return index;
      }

      if (result > target) {
        i = index + 1;
      } else {
        j = index - 1;
      }
    }
    return -1;
  }
}
