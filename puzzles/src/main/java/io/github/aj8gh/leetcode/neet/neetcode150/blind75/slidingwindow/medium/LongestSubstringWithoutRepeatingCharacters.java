package io.github.aj8gh.leetcode.neet.neetcode150.blind75.slidingwindow.medium;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

  public int solve(String s) {
    var longest = 0;
    var current = 0;
    var lastUniqueIndex = 0;
    var found = new HashMap<Character, Integer>();

    for (int i = 0; i < s.length(); i++) {
      var c = s.charAt(i);
      if (found.containsKey(c)) {
        var lastOccurrence = found.get(c);
        if (lastOccurrence >= lastUniqueIndex) {
          lastUniqueIndex = lastOccurrence;
          current = i - lastUniqueIndex;
        } else {
          longest = Math.max(++current, longest);
        }
      } else {
        longest = Math.max(++current, longest);
      }
      found.put(c, i);
    }

    return longest;
  }

  public int solveSlidingWindow(String s) {
    int i = 0, j = 0, max = 1;
    var found = new HashSet<>();
    while (j < s.length()) {
      if (!found.add(s.charAt(j))) {
        while (s.charAt(i) != s.charAt(j)) {
          found.remove(s.charAt(i++));
        }
        i++;
      }
      max = Math.max(max, ++j - i);
    }
    return max;
  }
}
