package io.github.aj8gh.leetcode.tracks.algo.track1.day9;

public class OptimisedMatrix {

  public int[][] updateMatrix(int[][] mat) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        int minNeighbour = getMinNeighbourMinus(i, j, mat);
        if (minNeighbour >= 0) {
          mat[i][j] = minNeighbour + 1;
        }
      }
    }

    for (int i = mat.length - 1; i >= 0; i--) {
      for (int j = mat[i].length - 1; j >= 0; j--) {
        if (mat[i][j] != 0) {
          int minNeighbour = getMinNeighbourPlus(i, j, mat);
          if (minNeighbour >= 0) {
            mat[i][j] = minNeighbour + 1;
          }
        }
      }
    }

    return mat;
  }

  private int getMinNeighbourMinus(int i, int j, int[][] mat) {
    if (i > 0 && j > 0) {
      return Math.min(mat[i - 1][j], mat[i][j - 1]);
    } else if (i > 0) {
      return mat[i - 1][j];
    } else if (j > 0) {
      return mat[i][j - 1];
    }
    return -1;
  }

  private int getMinNeighbourPlus(int i, int j, int[][] mat) {
    if (i < mat.length && j < mat[i].length) {
      return Math.min(mat[i + 1][j], mat[i][j + 1]);
    } else if (j < mat[i].length) {
      return mat[i][j + 1];
    }
    return mat[i + 1][j];
  }
}
