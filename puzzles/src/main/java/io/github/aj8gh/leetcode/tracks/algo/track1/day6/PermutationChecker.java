package io.github.aj8gh.leetcode.tracks.algo.track1.day6;

import java.util.HashMap;
import java.util.Map;

public class PermutationChecker {

  public boolean checkInclusion(String s1, String s2) {
    var chars1 = toChars(s1);
    for (int i = 0; i <= s2.length() - s1.length(); i++) {
      if (chars1.equals(toChars(s2.substring(i, i + s1.length())))) {
        return true;
      }
    }
    return false;
  }

  private Map<Character, Integer> toChars(String s) {
    var map = new HashMap<Character, Integer>();
    for (char c : s.toCharArray()) {
      map.merge(c, 1, Integer::sum);
    }
    return map;
  }
}
