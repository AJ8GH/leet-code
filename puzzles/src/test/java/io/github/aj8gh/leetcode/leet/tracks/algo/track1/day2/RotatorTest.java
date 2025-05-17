package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RotatorTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 3, 4, 5, 6, 7}, 1, new int[] {7, 1, 2, 3, 4, 5, 6}),
        Arguments.of(new int[] {1, 2, 3, 4, 5, 6, 7}, 2, new int[] {6, 7, 1, 2, 3, 4, 5}),
        Arguments.of(new int[] {1, 2, 3, 4, 5, 6, 7}, 3, new int[] {5, 6, 7, 1, 2, 3, 4}),
        Arguments.of(new int[] {-1, -100, 3, 99}, 2, new int[] {3, 99, -1, -100})
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void rotate(int[] inputArray, int k, int[] expected) {
    var rotator = new Rotator();
    rotator.rotate(inputArray, k);
    assertArrayEquals(expected, inputArray);
  }
}
