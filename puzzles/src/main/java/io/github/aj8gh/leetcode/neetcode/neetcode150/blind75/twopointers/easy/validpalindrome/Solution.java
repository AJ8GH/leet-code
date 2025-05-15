package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.twopointers.easy.validpalindrome;

public class Solution {

  private static final int UPPER_A = 65;
  private static final int UPPER_Z = 90;
  private static final int LOWER_A = 97;
  private static final int LOWER_Z = 122;
  private static final int ZERO = 48;
  private static final int NINE = 57;

  public boolean solve(String s) {
    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
      var first = s.charAt(i);
      while (isAlphaNumeric(first)) {
        first = s.charAt(++i);
      }
      first = toUpper(first);

      var last = s.charAt(j);
      while (isAlphaNumeric(last)) {
        last = s.charAt(--j);
      }
      last = toUpper(last);

      if (first != last) {
        return false;
      }
    }
    return true;
  }

  private static char toUpper(char first) {
    if (first >= LOWER_A) {
      first -= 32;
    }
    return first;
  }

  private static boolean isAlphaNumeric(char last) {
    return last < ZERO
        || last > LOWER_Z
        || (last > NINE && last < UPPER_A)
        || (last > UPPER_Z && last < LOWER_A);
  }
}
