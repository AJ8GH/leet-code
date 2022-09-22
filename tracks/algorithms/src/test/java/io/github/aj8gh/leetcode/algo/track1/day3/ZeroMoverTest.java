package io.github.aj8gh.leetcode.algo.track1.day3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ZeroMoverTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(new int[]{0}, new int[]{0}),
        Arguments.of(new int[]{0, 1}, new int[]{1, 0}),
        Arguments.of(new int[]{1, 0}, new int[]{1, 0}),
        Arguments.of(new int[]{0, 0, 1}, new int[]{1, 0, 0}),
        Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0})
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void moveZeroes(int[] inputArray, int[] expected) {
    var zeroMover = new ZeroMover();
    zeroMover.moveZeroes(inputArray);
    assertArrayEquals(expected, inputArray);
  }
}
