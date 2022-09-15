package io.github.aj8gh.leetcode.algos.algoii;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SquareSorterTest {

  private SquareSorter squareSorter;

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(new int[]{-4, -1, 0, 3, 10}, new int[]{0, 1, 9, 16, 100}),
        Arguments.of(new int[]{-7, -3, 2, 3, 11}, new int[]{4, 9, 9, 49, 121})
    );
  }

  @BeforeEach
  void setUp() {
    squareSorter = new SquareSorter();
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void sortedSquares(int[] inputArray, int[] expectedOutput) {
    var actualOutput = squareSorter.sortedSquares(inputArray);
    assertArrayEquals(expectedOutput, actualOutput);
  }
}
