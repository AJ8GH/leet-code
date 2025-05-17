package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day4;

public class Reverser {

  public void reverseString(char[] s) {
    int j = s.length - 1;
    for (int i = 0; i < s.length / 2; i++) {
      char numI = s[i];
      s[i] = s[j];
      s[j] = numI;
      j--;
    }
  }
}
