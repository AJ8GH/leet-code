package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FloodFillerTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(
            new int[][] {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
            }, 1, 1, 2,
            new int[][] {
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
            }
        ),
        Arguments.of(
            new int[][] {
                {0, 0, 0},
                {0, 0, 0}
            }, 0, 0, 0,
            new int[][] {
                {0, 0, 0},
                {0, 0, 0}
            }
        ),
        Arguments.of(
            new int[][] {
                {0, 0, 0},
                {0, 1, 0}
            }, 1, 1, 2,
            new int[][] {
                {0, 0, 0},
                {0, 2, 0}
            }
        )
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void floodFill(int[][] image, int sr, int sc, int color, int[][] expected) {
    var floodFiller = new FloodFiller();
    var actual = floodFiller.floodFill(image, sr, sc, color);
    assertArrayEquals(expected, actual);
  }
}
