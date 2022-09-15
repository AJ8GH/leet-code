package io.github.aj8gh.leetcode.algoi;

import static org.junit.jupiter.api.Assertions.*;

import io.github.aj8gh.leetcode.algos.algoi.InsertSearcher;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class InsertSearcherTest {

  private InsertSearcher insertSearcher;

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
        Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
        Arguments.of(new int[]{1, 3, 5, 6}, 7, 4),
        Arguments.of(new int[]{1, 3}, 2, 1),
        Arguments.of(new int[]{1, 3}, 1, 0),
        Arguments.of(new int[]{1, 3, 5}, 4, 2),
        Arguments.of(new int[]{1, 3, 5}, 1, 0),
        Arguments.of(new int[]{1, 3, 5}, 5, 2)
    );
  }

  @BeforeEach
  void setUp() {
    insertSearcher = new InsertSearcher();
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void searchInsert(int[] inputArray, int target, int expectedOutput) {
    var actualOutput = insertSearcher.searchInsert(inputArray, target);
    assertEquals(expectedOutput, actualOutput);
  }
}
