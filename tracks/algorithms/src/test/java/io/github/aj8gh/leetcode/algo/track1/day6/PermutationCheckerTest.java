package io.github.aj8gh.leetcode.algo.track1.day6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PermutationCheckerTest {
  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of("ab", "eidbaooo", true),
        Arguments.of("ab", "eidboaoo", false)
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void checkInclusion(String s1, String s2, boolean expected) {
    var permutationChecker = new PermutationChecker();
    var actual = permutationChecker.checkInclusion(s1, s2);
    assertEquals(expected, actual);
  }
}
