package io.github.aj8gh.leetcode.algo.track1.day7;

public class AreaCalculator {

  private int currentSize;
  private int maxSize;

  public int maxAreaOfIsland(int[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 1) {
          exploreIsland(i, j, grid);
          currentSize = 0;
        }
      }
    }
    return maxSize;
  }

  private void exploreIsland(int i, int j, int[][] grid) {
    grid[i][j] = -1;
    currentSize++;
    int[][] neighbours = {
        {i + 1, j},
        {i - 1, j},
        {i, j + 1},
        {i, j - 1},
    };

    for (int[] neighbour : neighbours) {
      int newI = neighbour[0];
      int newJ = neighbour[1];
      if (inBounds(newI, newJ, grid) && grid[newI][newJ] == 1) {
        exploreIsland(newI, newJ, grid);
      }
    }
    maxSize = Math.max(maxSize, currentSize);
  }

  private boolean inBounds(int i, int j, int[][] grid) {
    return i >= 0 && j >= 0 && i < grid.length && j < grid[i].length;
  }
}
