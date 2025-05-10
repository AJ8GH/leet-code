package io.github.aj8gh.leetcode.tracks.algo.track1.day9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Matrix {

  private final Queue<int[]> queue = new ArrayDeque<>();
  private boolean[][] visited;

  public int[][] updateMatrix(int[][] mat) {
    visited = new boolean[mat.length][];
    for (int i = 0; i < visited.length; i++) {
      visited[i] = new boolean[mat[0].length];
    }

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] != 0) {
          int distance = findNearestZero(i, j, mat);
          mat[i][j] = distance;
        }
      }
    }
    return mat;
  }

  private int findNearestZero(int i, int j, int[][] mat) {
    queueNeighbours(i, j, mat);
    int distance = 1;

    while (!queue.isEmpty()) {
      var nodesToExplore = new ArrayList<int[]>();

      while (!queue.isEmpty()) {
        var node = queue.poll();
        if (mat[node[0]][node[1]] == 0) {
          queue.clear();
          for (var row : visited) {
            Arrays.fill(row, false);
          }
          return distance;
        }
        nodesToExplore.add(node);
      }
      nodesToExplore.forEach(n -> queueNeighbours(n[0], n[1], mat));
      distance++;
    }
    return distance;
  }

  private void queueNeighbours(int i, int j, int[][] mat) {
    if (visited[i][j]) {
      return;
    }
    visited[i][j] = true;
    var neighbours = new int[][] {
        {i, j + 1},
        {i + 1, j},
        {i, j - 1},
        {i - 1, j}
    };

    for (var neighbour : neighbours) {
      int newI = neighbour[0];
      int newJ = neighbour[1];

      if (newI >= 0 && newJ >= 0 && newI < mat.length && newJ < mat[newI].length) {
        queue.add(neighbour);
      }
    }
  }
}
