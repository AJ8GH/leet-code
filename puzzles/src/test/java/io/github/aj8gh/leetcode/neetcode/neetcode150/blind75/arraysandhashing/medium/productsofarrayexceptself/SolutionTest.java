package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.arraysandhashing.medium.productsofarrayexceptself;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution subject = new Solution();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 4, 6}, new int[] {48, 24, 12, 8}),
        Arguments.of(new int[] {-1, 0, 1, 2, 0}, new int[] {0, 0, 0, 0, 0}),
        Arguments.of(new int[] {-1, 0, 1, 2, 3}, new int[] {0, -6, 0, 0, 0}));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(int[] nums, int[] expected) {
    var actual = subject.solve(nums);
    assertThat(actual).isEqualTo(expected);
  }
}
