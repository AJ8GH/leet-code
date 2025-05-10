package io.github.aj8gh.leetcode.algo.track1.day7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AreaCalculatorTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(
            new int[][] {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}},
            6
        ),
        Arguments.of(
            new int[][] {{0, 0, 0, 0, 0, 0, 0, 0}},
            0
        )
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void maxAreaOfIsland(int[][] grid, int expected) {
    var areaCalculator = new AreaCalculator();
    var actual = areaCalculator.maxAreaOfIsland(grid);
    assertEquals(expected, actual);
  }
}
