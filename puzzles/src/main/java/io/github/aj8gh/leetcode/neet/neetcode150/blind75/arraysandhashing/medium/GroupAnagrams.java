package io.github.aj8gh.leetcode.neet.neetcode150.blind75.arraysandhashing.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {

  public List<List<String>> solve(String[] strs) {
    return new ArrayList<>(Arrays.stream(strs)
        .collect(Collectors.groupingBy(this::letterCount))
        .values());
  }

  private Map<String, Long> letterCount(String s) {
    return Arrays.stream(s.split(""))
        .collect(Collectors.groupingBy(key -> key, Collectors.counting()));
  }
}
