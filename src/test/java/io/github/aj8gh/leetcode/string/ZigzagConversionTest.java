package io.github.aj8gh.leetcode.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ZigzagConversionTest {
  private ZigzagConversion zigzagConversion;

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
        Arguments.of("PAYPALISHIRING", 4, "PINALSIGYAHRPI")
    );
  }

//  P A Y P A L I S H I R I N G
//  P A H N A P L S I I G Y I R

//  P A Y P A L I S H I R I N G
//  P I N A L S I G Y A H R P I

  @BeforeEach
  void setUp() {
    zigzagConversion = new ZigzagConversion();
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void lengthOfLongestSubString(String inputString, int rows, String expectedOutput) {
    var actualOutput = zigzagConversion.convert(inputString, rows);
    assertEquals(expectedOutput, actualOutput);
  }
}
