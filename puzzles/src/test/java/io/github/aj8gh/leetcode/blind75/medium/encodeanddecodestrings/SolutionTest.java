package io.github.aj8gh.leetcode.blind75.medium.encodeanddecodestrings;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution subject = new Solution();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(List.of(1, 2, 2, 3, 3, 3)),
        Arguments.of(List.of(7, 7)));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(List<String> strs) {
    var encoded = subject.encode(strs);
    var actual = subject.decode(encoded);
    assertThat(actual).isEqualTo(strs);
  }
}
