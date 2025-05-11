package io.github.aj8gh.leetcode.graph.validsudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

  private static final Set<Character> VALID = Set.of('1', '2', '3', '4', '5', '6', '7', '8', '9');

  public boolean solve(char[][] board) {
    var rows = new HashMap<Integer, HashSet<Character>>();
    var cols = new HashMap<Integer, HashSet<Character>>();
    var subBoxes = new HashMap<Integer, HashMap<Integer, HashSet<Character>>>();

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        var n = board[i][j];

        if (n == '.') {
          continue;
        }

        if (!VALID.contains(n)) {
          return false;
        }

        if (!rows.computeIfAbsent(i, key -> new HashSet<>()).add(n)) {
          return false;
        }

        if (!cols.computeIfAbsent(j, key -> new HashSet<>()).add(n)) {
          return false;
        }

        if (!subBoxes
            .computeIfAbsent(i / 3, key -> new HashMap<>())
            .computeIfAbsent(j / 3, key -> new HashSet<>()).add(n)) {
          return false;
        }
      }
    }
    return true;
  }
}
