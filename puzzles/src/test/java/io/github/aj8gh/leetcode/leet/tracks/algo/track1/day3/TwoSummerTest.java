package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSummerTest {

  private static final String INPUT_FILE = "src/test/resources/two-summer-input.txt";

  private static Stream<Arguments> inputProvider() throws IOException {
    return Stream.of(
        Arguments.of(new int[] {2, 3, 4}, 6, new int[] {1, 3}),
        Arguments.of(new int[] {2, 7, 11, 15}, 9, new int[] {1, 2}),
        Arguments.of(new int[] {1, 2, 3, 4, 4, 9, 56, 90}, 8, new int[] {4, 5}),
        getLargeInput()
    );
  }

  private static Arguments getLargeInput() throws IOException {
    try (var reader = new BufferedReader(new FileReader(INPUT_FILE))) {
      String line = reader.readLine();
      int[] numbers = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
      var target = Integer.parseInt(reader.readLine());
      return Arguments.of(numbers, target, new int[] {29_999, 30_000});
    }
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void towSum(int[] inputArray, int target, int[] expected) {
    var twoSummer = new TwoSummer();
    var actual = twoSummer.twoSum(inputArray, target);
    assertArrayEquals(expected, actual);
  }
}
