package io.github.aj8gh.leetcode.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
  public int lengthOfLongestSubstring(String s) {
    if (s.isEmpty()) return 0;

    var chars = s.split("");
    Set<String> subStringSet = new HashSet<>();
    int maxLength = 0;
    int length = 0;

    for (String c : chars) {
      if (subStringSet.add(c)) {
        length++;
        if (length > maxLength) maxLength = length;
      } else {
        length = 1;
        subStringSet.clear();
      }
    }
    return maxLength;
  }
}
