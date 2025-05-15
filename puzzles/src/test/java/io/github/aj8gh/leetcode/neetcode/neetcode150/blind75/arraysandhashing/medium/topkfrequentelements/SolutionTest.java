package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.arraysandhashing.medium.topkfrequentelements;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution subject = new Solution();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 2, 3, 3, 3}, 2, new int[] {2, 3}),
        Arguments.of(new int[] {7, 7}, 1, new int[] {7}));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(int[] nums, int k, int[] expected) {
    var actual = subject.solve(nums, k);
    assertThat(actual).containsExactlyInAnyOrder(expected);
  }
}
