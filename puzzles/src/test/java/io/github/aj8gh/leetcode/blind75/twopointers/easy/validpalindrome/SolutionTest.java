package io.github.aj8gh.leetcode.blind75.twopointers.easy.validpalindrome;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution subject = new Solution();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of("Was it a car or a cat I saw?", true),
        Arguments.of("tab a cat", false));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(String s, boolean expected) {
    var actual = subject.solve(s);
    assertThat(actual).isEqualTo(expected);
  }
}
