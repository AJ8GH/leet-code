package io.github.aj8gh.leetcode.tracks.algo.track1.day1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BadVersionCheckerTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(5, 4),
        Arguments.of(1, 1),
        Arguments.of(3, 1),
        Arguments.of(2126753390, 1702766719)
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void firstBadVersion(int n, int badVersion) {
    var badVersionChecker = new BadVersionChecker();
    badVersionChecker.setBadVersion(badVersion);
    var actualOutput = badVersionChecker.firstBadVersion(n);
    assertEquals(badVersion, actualOutput);
  }
}
