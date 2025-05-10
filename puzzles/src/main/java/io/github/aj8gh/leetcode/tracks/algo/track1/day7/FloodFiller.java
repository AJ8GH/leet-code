package io.github.aj8gh.leetcode.tracks.algo.track1.day7;

public class FloodFiller {

  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    var originalColor = image[sr][sc];
    if (originalColor == color) {
      return image;
    }
    image[sr][sc] = color;
    fill(image, sr, sc, color, originalColor);
    return image;
  }

  private void fill(int[][] image, int sr, int sc, int color, int originalColor) {
    if (sr < image.length - 1 && image[sr + 1][sc] == originalColor) {
      image[sr + 1][sc] = color;
      fill(image, sr + 1, sc, color, originalColor);
    }
    if (sr > 0 && image[sr - 1][sc] == originalColor) {
      image[sr - 1][sc] = color;
      fill(image, sr - 1, sc, color, originalColor);
    }
    if (sc > 0 && image[sr][sc - 1] == originalColor) {
      image[sr][sc - 1] = color;
      fill(image, sr, sc - 1, color, originalColor);

    }
    if (sc < image[sr].length - 1 && image[sr][sc + 1] == originalColor) {
      image[sr][sc + 1] = color;
      fill(image, sr, sc + 1, color, originalColor);
    }
  }
}
