package io.github.aj8gh.leetcode.neet.neetcode150.blind75.arraysandhashing.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestConsecutiveSequenceTest {

  private final LongestConsecutiveSequence subject = new LongestConsecutiveSequence();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(new int[] {2, 20, 4, 10, 3, 4, 5}, 4),
        Arguments.of(new int[] {0, 3, 2, 5, 4, 6, 1, 1}, 7),
        Arguments.of(new int[] {9}, 1),
        Arguments.of(new int[] {}, 0));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(int[] nums, int expected) {
    var actual = subject.solve(nums);
    assertThat(actual).isEqualTo(expected);
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void testRefactored(int[] nums, int expected) {
    var actual = subject.solveRefactored(nums);
    assertThat(actual).isEqualTo(expected);
  }
}
