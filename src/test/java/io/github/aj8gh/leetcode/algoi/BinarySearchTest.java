package io.github.aj8gh.leetcode.algoi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.algos.algoi.BinarySearch;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BinarySearchTest {

  private BinarySearch binarySearch;

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(new int[]{1}, 1, 0),
        Arguments.of(new int[]{1, 2}, 1, 0),
        Arguments.of(new int[]{1, 2, 3}, 3, 2),
        Arguments.of(new int[]{1, 2, 3, 4, 5}, 4, 3),
        Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
        Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1)
    );
  }

  @BeforeEach
  void setUp() {
    binarySearch = new BinarySearch();
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void search(int[] inputArray, int index, int expectedOutput) {
    var actualOutput = binarySearch.search(inputArray, index);
    assertEquals(expectedOutput, actualOutput);
  }
}
