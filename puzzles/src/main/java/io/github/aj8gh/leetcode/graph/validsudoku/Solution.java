package io.github.aj8gh.leetcode.graph.validsudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

  private static final Set<Character> VALID = Set.of('1', '2', '3', '4', '5', '6', '7', '8', '9');

  public boolean solve(char[][] board) {
    var rows = new ArrayList<Set<Character>>();
    for (int i = 0; i < 9; i++) {
      rows.add(new HashSet<>());
    }

    var cols = new ArrayList<Set<Character>>();
    for (int i = 0; i < 9; i++) {
      cols.add(new HashSet<>());
    }

    var subBoxes = new ArrayList<List<Set<Character>>>();
    for (int i = 0; i < 3; i++) {
      var l = new ArrayList<Set<Character>>();
      for (int j = 0; j < 3; j++) {
        l.add(new HashSet<>());
      }
      subBoxes.add(l);
    }

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        var n = board[i][j];
        if (n == '.') {
          continue;
        }

        if (!VALID.contains(n)) {
          return false;
        }

        if (!rows.get(i).add(n)) {
          return false;
        }
        if (!cols.get(j).add(n)) {
          return false;
        }

        if (!subBoxes.get(i / 3).get(j / 3).add(n)) {
          return false;
        }
      }
    }
    return true;
  }
}
