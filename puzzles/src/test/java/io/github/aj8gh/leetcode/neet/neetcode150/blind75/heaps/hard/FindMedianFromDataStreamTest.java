package io.github.aj8gh.leetcode.neet.neetcode150.blind75.heaps.hard;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindMedianFromDataStreamTest {

  private final FindMedianFromDataStream subject = new FindMedianFromDataStream();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(List.of(1), 1),
        Arguments.of(List.of(1, 3), 2),
        Arguments.of(List.of(1, 3, 2), 2));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(List<Integer> nums, int expected) {
    nums.forEach(subject::addNum);
    var actual = subject.solve();
    assertThat(actual).isEqualTo(expected);
  }
}
