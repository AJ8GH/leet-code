package io.github.aj8gh.leetcode.neet.neetcode150.blind75.arraysandhashing.medium;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EncodeAndDecodeStringsTest {

  private final EncodeAndDecodeStrings subject = new EncodeAndDecodeStrings();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(List.of("neet", "code", "love", "you")),
        Arguments.of(List.of("we", "say", ":", "yes")),
        Arguments.of(List.of()));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(List<String> strs) {
    var encoded = subject.encode(strs);
    var actual = subject.decode(encoded);
    assertThat(actual).isEqualTo(strs);
  }
}
