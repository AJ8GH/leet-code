package io.github.aj8gh.leetcode.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestPalindromeTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of("babad", "bab"),
        Arguments.of("cbbd", "bb")
    );
  }

  @Disabled
  @ParameterizedTest
  @MethodSource("inputProvider")
  void longestPalindrome(String input, String expectedOutput) {
    var longestPalindrome = new LongestPalindrome();
    var actualOutput = longestPalindrome.longestPalindrome(input);
    assertEquals(expectedOutput, actualOutput);
  }
}
