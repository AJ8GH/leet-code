package io.github.aj8gh.leetcode.tracks.algo.track1.day4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WordReverserTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of("God Ding", "doG gniD"),
        Arguments.of("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc")
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void reverseWords(String inputWords, String expected) {
    var wordReverser = new WordReverser();
    var actual = wordReverser.reverseWords(inputWords);
    assertEquals(expected, actual);
  }
}
