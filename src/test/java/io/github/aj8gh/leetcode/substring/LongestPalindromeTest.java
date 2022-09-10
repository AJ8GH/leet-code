package io.github.aj8gh.leetcode.substring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestPalindromeTest {
  private LongestPalindrome longestPalindrome;

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of("babad", "bab"),
        Arguments.of("cbbd", "bb")
    );
  }

  @BeforeEach
  void setUp() {
    longestPalindrome = new LongestPalindrome();
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void lengthOfLongestSubString(String input, String expectedOutput) {
    var actualOutput = longestPalindrome.longestPalindrome(input);
    assertEquals(expectedOutput, actualOutput);
  }
}
