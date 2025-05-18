package io.github.aj8gh.leetcode.neet.neetcode150.blind75.graphs.medium;

public class NumberOfIslands {

  private static final char LAND = '1';
  private static final char FOUND = 'F';

  public int solve(char[][] grid) {
    var found = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == LAND) {
          found++;
          grid[i][j] = FOUND;
          mapIsland(grid, i, j);
        }
      }
    }
    return found;
  }

  private void mapIsland(char[][] grid, int i, int j) {
    var cells = new int[][] {
        {i, j + 1},
        {i, j - 1},
        {i + 1, j},
        {i - 1, j},
    };

    for (var c : cells) {
      if (c[0] < 0
          || c[0] >= grid.length
          || c[1] < 0
          || c[1] >= grid[c[0]].length) {
        continue;
      }
      if (grid[c[0]][c[1]] == LAND) {
        grid[c[0]][c[1]] = FOUND;
        mapIsland(grid, c[0], c[1]);
      }
    }
  }
}
