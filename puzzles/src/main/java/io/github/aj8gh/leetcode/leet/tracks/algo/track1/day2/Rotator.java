package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day2;

import java.util.HashMap;

public class Rotator {

  public void rotate(int[] nums, int k) {
    var numMap = new HashMap<Integer, Integer>();
    for (int i = 0, length = nums.length; i < length; i++) {
      int currentNum = numMap.containsKey(i) ? numMap.get(i) : nums[i];
      int j = (i + k) % length;
      numMap.put(j, nums[j]);
      nums[j] = currentNum;
    }
  }
}
