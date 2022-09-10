package io.github.aj8gh.leetcode.substring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestSubStringTest {
  private LongestSubString longestSubString;

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of("abcabcbb", 3),
        Arguments.of("", 0),
        Arguments.of("aab", 2),
        Arguments.of("bbbbb", 1),
        Arguments.of("dvdf", 3),
        Arguments.of("pwwkew", 3),
        Arguments.of("aabaab!bb", 3),
        Arguments.of("fbojelwjgercer", 7),
        Arguments.of("bpfbhmipx", 7)
    );
  }

  @BeforeEach
  void setUp() {
    longestSubString = new LongestSubString();
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void lengthOfLongestSubString(String input, int expectedLength) {
    var actualLength = longestSubString.lengthOfLongestSubstring(input);
    assertEquals(expectedLength, actualLength);
  }
}
