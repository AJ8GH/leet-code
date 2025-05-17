package io.github.aj8gh.leetcode.neet.neetcode150.blind75.arraysandhashing.easy;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

public class ValidAnagram {

  public boolean solve(String s, String t) {
    return letterCount(s).equals(letterCount(t));
  }

  private Map<String, Long> letterCount(String s) {
    return Arrays.stream(s.split(""))
        .collect(groupingBy(Function.identity(), counting()));
  }
}
