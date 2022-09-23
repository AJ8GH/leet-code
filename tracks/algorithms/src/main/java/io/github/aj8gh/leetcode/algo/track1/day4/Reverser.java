package io.github.aj8gh.leetcode.algo.track1.day4;

public class Reverser {

  public void reverseString(char[] s) {
    int j = s.length - 1;
    for (int i = 0; i < s.length / 2; i++) {
      char iNum = s[i];
      s[i] = s[j];
      s[j] = iNum;
      j--;
    }
  }
}
