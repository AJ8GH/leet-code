package io.github.aj8gh.leetcode.algo.track1.day4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ReverserTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(new char[]{'h','e','l','l','o'}, new char[]{'o','l','l','e','h'}),
        Arguments.of(new char[]{'H','a','n','n','a','h'}, new char[]{'h','a','n','n','a','H'})
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void reverseString(char[] inputArray, char[] expected) {
    var reverser = new Reverser();
    reverser.reverseString(inputArray);
    assertArrayEquals(expected, inputArray);
  }
}
