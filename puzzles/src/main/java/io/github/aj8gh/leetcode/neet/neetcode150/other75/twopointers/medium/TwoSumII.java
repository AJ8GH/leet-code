package io.github.aj8gh.leetcode.neet.neetcode150.other75.twopointers.medium;

public class TwoSumII {

  public int[] solve(int[] numbers, int target) {
    var i = 0;
    var j = numbers.length - 1;

    while (i < j) {
      var sum = numbers[i] + numbers[j];

      while (sum > target) {
        sum = numbers[i] + numbers[--j];
      }

      while (sum < target) {
        sum = numbers[++i] + numbers[j];
      }

      if (sum == target) {
        return new int[] {i + 1, j + 1};
      }
    }
    return numbers;
  }
}
