package io.github.aj8gh.leetcode.blind75.twopointers.easy.validpalindrome;

public class Solution {

  public boolean solve(String s) {
    var split = s.toLowerCase()
        .replaceAll("\\W+", "")
        .split("");

    var mid = split.length / 2;
    for (int i = 0; i < mid; i++) {
      int j = split.length - 1 - i;
      var first = split[i];
      var last = split[j];
      if (!first.equals(last)) {
        return false;
      }
    }

    return true;
  }
}
