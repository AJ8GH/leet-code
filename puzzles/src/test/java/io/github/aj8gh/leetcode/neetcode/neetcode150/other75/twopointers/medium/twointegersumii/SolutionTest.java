package io.github.aj8gh.leetcode.neetcode.neetcode150.other75.twopointers.medium.twointegersumii;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution subject = new Solution();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 3, 4}, 3, new int[] {1, 2}),
        Arguments.of(new int[] {1, 3, 4, 7, 8, 10, 12, 15}, 14, new int[] {3, 6}),
        Arguments.of(new int[] {-10, -2, 0, 1, 2, 4, 7, 8, 10, 12, 18}, 16, new int[] {2, 11}),
        Arguments.of(new int[] {-1000, -999, 0, 999, 1000}, -1, new int[] {1, 4}),
        Arguments.of(new int[] {-10, -5, 0, 3, 7}, -2, new int[] {2, 4}),
        Arguments.of(new int[] {1, 2, 5, 7, 9}, 12, new int[] {3, 4}));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(int[] nums, int target, int[] expected) {
    var actual = subject.solve(nums, target);
    assertThat(actual).isEqualTo(expected);
  }
}
