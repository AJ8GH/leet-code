package io.github.aj8gh.leetcode.neet.neetcode150.blind75.graphs.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NumberOfIslandsTest {

  private final NumberOfIslands subject = new NumberOfIslands();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(new char[][] {
            {'0', '1', '1', '1', '0'},
            {'0', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}}, 1),
        Arguments.of(new char[][] {
            {'1', '1', '0', '0', '1'},
            {'1', '1', '0', '0', '1'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}}, 4));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(char[][] grid, int expected) {
    var actual = subject.solve(grid);
    assertThat(actual).isEqualTo(expected);
  }
}
