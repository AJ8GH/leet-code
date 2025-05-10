package io.github.aj8gh.leetcode.blind75.medium.encodeanddecodestrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

  private static final String DELIM = "_____DELIM_____";

  public String encode(List<String> strs) {
    if (strs.isEmpty()) {
      return null;
    }
    return String.join(DELIM, strs);
  }

  public List<String> decode(String str) {
    if (str == null) {
      return Collections.emptyList();
    }
    return Arrays.asList(str.split(DELIM));
  }
}
