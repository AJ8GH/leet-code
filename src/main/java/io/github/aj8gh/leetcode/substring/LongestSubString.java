package io.github.aj8gh.leetcode.substring;


import java.util.ArrayDeque;
import java.util.HashSet;

public class LongestSubString {
  public int lengthOfLongestSubstring(String s) {
    return slowSolution(s);
  }

  public int slowSolution(String s) {
    if (s.isEmpty()) {
      return 0;
    }
    var charSet = new HashSet<String>();
    var stack = new ArrayDeque<String>();
    var newStack = new ArrayDeque<String>();
    int maxLength = 0;
    int length = 0;

    for (var c : s.split("")) {
      if (charSet.add(c)) {
        stack.push(c);
        length++;
      } else {
        charSet.clear();
        charSet.add(c);
        length = 1;
        while (!stack.isEmpty()) {
          var el = stack.pop();
          if (el.equals(c)) {
            break;
          }
          newStack.push(el);
          charSet.add(el);
          length++;
        }
        stack = new ArrayDeque<>(newStack);
        stack.push(c);
      }

      if (length > maxLength) {
        maxLength = length;
      }
    }
    return maxLength;
  }
}
