package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.arraysandhashing.easy.validanagram;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution subject = new Solution();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of("racecar", "carrace", true),
        Arguments.of("jar", "jam", false));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(String s, String t, boolean expected) {
    var actual = subject.solve(s, t);
    assertThat(actual).isEqualTo(expected);
  }
}
