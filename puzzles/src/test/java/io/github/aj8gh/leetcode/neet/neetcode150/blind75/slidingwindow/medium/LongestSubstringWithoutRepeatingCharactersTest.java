package io.github.aj8gh.leetcode.neet.neetcode150.blind75.slidingwindow.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestSubstringWithoutRepeatingCharactersTest {

  private final LongestSubstringWithoutRepeatingCharacters subject = new LongestSubstringWithoutRepeatingCharacters();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of("zxyzxyz", 3),
        Arguments.of("dvdf", 3),
        Arguments.of("thequickbrownfoxjumpsoverthelazydogthequickbrownfoxjumpsovert", 17),
        Arguments.of("xxxx", 1));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(String s, int expected) {
    var actual = subject.solve(s);
    assertThat(actual).isEqualTo(expected);
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void testSlidingWindow(String s, int expected) {
    var actual = subject.solveSlidingWindow(s);
    assertThat(actual).isEqualTo(expected);
  }
}
