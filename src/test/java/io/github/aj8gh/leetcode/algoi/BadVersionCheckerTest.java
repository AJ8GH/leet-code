package io.github.aj8gh.leetcode.algoi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.algos.algoi.BadVersionChecker;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BadVersionCheckerTest {

  private BadVersionChecker badVersionChecker;

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(5, 4),
        Arguments.of(1, 1),
        Arguments.of(3, 1),
        Arguments.of(2126753390, 1702766719)
    );
  }

  @BeforeEach
  void setUp() {
    badVersionChecker = new BadVersionChecker();
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void firstBadVersion(int n, int badVersion) {
    badVersionChecker.setBadVersion(badVersion);
    var actualOutput = badVersionChecker.firstBadVersion(n);
    assertEquals(badVersion, actualOutput);
  }
}
