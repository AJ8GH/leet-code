package io.github.aj8gh.leetcode.neet.neetcode150.blind75.slidingwindow.easy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BestTimeToBuyAndSellStockTest {

  private final BestTimeToBuyAndSellStock subject = new BestTimeToBuyAndSellStock();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(new int[] {10, 1, 5, 6, 7, 1}, 6),
        Arguments.of(new int[] {10, 8, 7, 5, 2}, 0));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(int[] prices, int expected) {
    var actual = subject.solve(prices);
    assertThat(actual).isEqualTo(expected);
  }
}
