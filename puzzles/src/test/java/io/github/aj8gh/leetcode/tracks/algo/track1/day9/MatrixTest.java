package io.github.aj8gh.leetcode.tracks.algo.track1.day9;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MatrixTest {

  private static final String INPUT_FILE = "src/test/resources/matrix-large-input.txt";

  private static Stream<Arguments> inputProvider() throws IOException {
    return Stream.of(
        Arguments.of(
            new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}},
            new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}),
        Arguments.of(
            new int[][] {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}},
            new int[][] {{0, 0, 0}, {0, 1, 0}, {1, 2, 1}}),
        Arguments.of(
            new int[][] {
                {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1},
                {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1},
                {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1},
                {1, 1, 1}, {0, 0, 0}
            },
            new int[][] {
                {19, 19, 19}, {18, 18, 18}, {17, 17, 17}, {16, 16, 16}, {15, 15, 15}, {14, 14, 14},
                {13, 13, 13}, {12, 12, 12}, {11, 11, 11}, {10, 10, 10}, {9, 9, 9}, {8, 8, 8},
                {7, 7, 7}, {6, 6, 6}, {5, 5, 5}, {4, 4, 4}, {3, 3, 3}, {2, 2, 2},
                {1, 1, 1}, {0, 0, 0}
            }),
        getLargeInput()
    );
  }

  private static Arguments getLargeInput() throws IOException {
    try (var reader = new BufferedReader(new FileReader(INPUT_FILE))) {
      String line = reader.readLine();
      int[] input = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();

      int[] expected = new int[input.length];
      for (int i = 0; i < input.length; i++) {
        expected[i] = input.length - i - 1;
      }

      return Arguments.of(new int[][] {input}, new int[][] {expected});
    }
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void updateMatrix(int[][] input, int[][] expected) {
    var matrix = new Matrix();
    var actual = matrix.updateMatrix(input);
    assertArrayEquals(expected, actual);
  }
}
