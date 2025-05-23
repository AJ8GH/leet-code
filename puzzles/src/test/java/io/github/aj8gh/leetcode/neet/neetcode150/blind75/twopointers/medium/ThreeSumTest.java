package io.github.aj8gh.leetcode.neet.neetcode150.blind75.twopointers.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ThreeSumTest {

  private final ThreeSum subject = new ThreeSum();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(new int[] {-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
        Arguments.of(new int[] {0, 1, 1}, List.of()),
        Arguments.of(new int[] {0, 0, 0, 0}, List.of(List.of(0, 0, 0))),
        Arguments.of(new int[] {-2, 0, 1, 1, 2}, List.of(List.of(-2, 0, 2), List.of(-2, 1, 1))));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(int[] nums, List<List<Integer>> expected) {
    var actual = subject.solve(nums);
    assertThat(actual.stream()
        .map(l -> l.stream().sorted().toList())
        .toList())
        .hasSameSizeAs(expected)
        .containsExactlyInAnyOrderElementsOf(expected.stream()
            .map(l -> l.stream().sorted().toList())
            .toList());
  }
}
