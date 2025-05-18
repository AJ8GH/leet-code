package io.github.aj8gh.leetcode.neet.neetcode150.blind75.dynamicprogramming.oned.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaximumProductSubArrayTest {

  private final MaximumProductSubArray subject = new MaximumProductSubArray();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, -3, 4}, 4),
        Arguments.of(new int[] {-2, -1}, 2),
        Arguments.of(new int[] {9, -9, 8, 8, -2, 5, 5, 1, 6, -7, 7}, 1555200),
        Arguments.of(new int[] {-4, 1, -3, 1, -2, 10}, 60),
        Arguments.of(new int[] {-2, 0, -1}, 0),
        Arguments.of(new int[] {-2}, -2),
        Arguments.of(new int[] {-2, 3, -4}, 24));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(int[] nums, int expected) {
    var actual = subject.solve(nums);
    assertThat(actual).isEqualTo(expected);
  }
}
