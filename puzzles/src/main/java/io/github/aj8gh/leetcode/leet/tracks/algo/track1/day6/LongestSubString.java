package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day6;

import java.util.HashMap;

public class LongestSubString {

  public int lengthOfLongestSubstring(String s) {
    if (s.isEmpty()) {
      return 0;
    }
    int maxLength = 0;
    var map = new HashMap<String, Integer>();
    var letters = s.split("");
    for (int i = 0; i < letters.length; i++) {
      var letter = letters[i];
      if (map.containsKey(letter)) {
        i = map.get(letter);
        map.clear();
      } else {
        map.put(letter, i);
        maxLength = Math.max(maxLength, map.size());
      }
    }
    return maxLength;
  }
}
