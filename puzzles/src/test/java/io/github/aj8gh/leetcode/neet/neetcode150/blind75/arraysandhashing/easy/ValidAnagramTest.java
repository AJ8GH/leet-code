package io.github.aj8gh.leetcode.neet.neetcode150.blind75.arraysandhashing.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ValidAnagramTest {

  private final ValidAnagram subject = new ValidAnagram();

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
