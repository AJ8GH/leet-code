package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.twopointers.medium.threesum;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution subject = new Solution();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(new int[] {-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
        Arguments.of(new int[] {0, 1, 1}, List.of()));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(int[] nums, List<List<Integer>> expected) {
    var actual = subject.solve(nums);
    assertThat(actual.stream()
        .map(l -> l.stream().sorted().toList())
        .toList())
        .containsExactlyInAnyOrderElementsOf(expected.stream()
            .map(l -> l.stream().sorted().toList())
            .toList());
  }
}
