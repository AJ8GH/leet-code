package io.github.aj8gh.leetcode.algo.track1.day9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@Disabled
class RottingOrangesTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(
            new int[][] {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}},
            4),
        Arguments.of(
            new int[][] {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}},
            -1),
        Arguments.of(
            new int[][] {{0, 2}},
            0)
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void orangesRotting(int[][] input, int expected) {
    var rottingOranges = new RottingOranges();
    var actual = rottingOranges.orangesRotting(input);
    assertEquals(expected, actual);
  }
}
