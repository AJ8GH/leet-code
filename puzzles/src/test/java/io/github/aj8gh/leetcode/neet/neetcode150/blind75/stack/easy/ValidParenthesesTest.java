package io.github.aj8gh.leetcode.neet.neetcode150.blind75.stack.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ValidParenthesesTest {

  private final ValidParentheses subject = new ValidParentheses();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of("[]", true),
        Arguments.of("[", false),
        Arguments.of("([{}])", true),
        Arguments.of("[(])", false));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(String s, boolean expected) {
    var actual = subject.solve(s);
    assertThat(actual).isEqualTo(expected);
  }
}
