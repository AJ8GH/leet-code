package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.arraysandhashing.easy.twosum;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution subject = new Solution();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(new int[] {3, 4, 5, 6}, 7, new int[] {0, 1}),
        Arguments.of(new int[] {4, 5, 6}, 10, new int[] {0, 2}),
        Arguments.of(new int[] {5, 5}, 10, new int[] {0, 1}));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(int[] nums, int target, int[] expected) {
    var actual = subject.solve(nums, target);
    assertThat(actual).containsExactlyInAnyOrder(expected);
  }
}
