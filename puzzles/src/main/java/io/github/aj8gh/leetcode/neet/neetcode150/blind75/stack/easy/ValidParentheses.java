package io.github.aj8gh.leetcode.neet.neetcode150.blind75.stack.easy;

import java.util.ArrayDeque;

public class ValidParentheses {

  public boolean solve(String s) {
    var stack = new ArrayDeque<Character>();
    for (int i = 0; i < s.length(); i++) {
      var c = s.charAt(i);
      if (c == '{' || c == '(' || c == '[') {
        stack.addFirst(c);
      }

      if (!switch (c) {
        case '}' -> !stack.isEmpty() && stack.pop() == '{';
        case ')' -> !stack.isEmpty() && stack.pop() == '(';
        case ']' -> !stack.isEmpty() && stack.pop() == '[';
        default -> true;
      }) {
        return false;
      }
    }

    return stack.isEmpty();
  }
}
