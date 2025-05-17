package io.github.aj8gh.leetcode.neet.neetcode150.blind75.greedy.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaximumSubArrayTest {

  private final MaximumSubArray subject = new MaximumSubArray();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(new int[] {2, -3, 4, -2, 2, 1, -1, 4}, 8),
        Arguments.of(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
        Arguments.of(new int[] {1, -1, 1}, 1),
        Arguments.of(new int[] {-1}, -1));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(int[] nums, int expected) {
    var actual = subject.solve(nums);
    assertThat(actual).isEqualTo(expected);
  }
}
