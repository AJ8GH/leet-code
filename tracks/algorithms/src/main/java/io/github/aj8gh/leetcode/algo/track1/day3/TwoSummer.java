package io.github.aj8gh.leetcode.algo.track1.day3;

import java.util.HashMap;
import java.util.Map;

public class TwoSummer {

  private final Map<Integer, Integer> map = new HashMap<>();

  public int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
      int num = numbers[i];
      int need = target - num;
      if (map.containsKey(need)) {
        int j = map.get(need);
        if (j != i) {
          return new int[] {j + 1, i + 1};
        }
      }
      map.put(num, i);
    }
    return new int[0];
  }
}
