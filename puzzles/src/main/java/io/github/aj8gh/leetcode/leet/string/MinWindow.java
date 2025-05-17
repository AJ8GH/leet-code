package io.github.aj8gh.leetcode.leet.string;

import java.util.ArrayList;
import java.util.Arrays;

public class MinWindow {

  String result = "";

  public String minWindow(String s, String t) {
    if (s.equals(t)) {
      return s;
    }

    for (int i = 0; i < s.length(); i++) {
      for (int j = i + t.length(); j <= s.length(); j++) {
        var slice = s.substring(i, j);
        if (slice.length() < t.length()) {
          continue;
        }

        if (slice.equals(t)) {
          return slice;
        }

        if (valid(slice, t) && (result.isEmpty() || slice.length() < result.length())) {
          result = slice;
        }
      }
    }
    return result;
  }

  private boolean valid(String slice, String t) {
    var letters = new ArrayList<>(Arrays.asList(t.split("")));
    for (var e : slice.split("")) {
      letters.remove(e);
    }
    return letters.isEmpty();
  }
}
