package io.github.aj8gh.leetcode.neet.neetcode150.blind75.arraysandhashing.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ContainsDuplicateTest {

  private final ContainsDuplicate subject = new ContainsDuplicate();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 3, 4}, false),
        Arguments.of(new int[] {1, 2, 3, 3}, true));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(int[] nums, boolean expected) {
    var actual = subject.solve(nums);
    assertThat(actual).isEqualTo(expected);
  }
}
