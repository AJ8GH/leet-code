package io.github.aj8gh.leetcode.tracks.algo.track1.day4;

import java.util.Arrays;

public class WordReverser {

  public String reverseWords(String s) {
    var words = s.split(" ");

    return String.join(" ", Arrays.stream(words)
        .map(this::reverse)
        .toArray(String[]::new));
  }

  private String reverse(String word) {
    var reversedWord = new StringBuilder();
    for (int i = word.length() - 1; i >= 0; i--) {
      reversedWord.append(word.charAt(i));
    }
    return reversedWord.toString();
  }
}
