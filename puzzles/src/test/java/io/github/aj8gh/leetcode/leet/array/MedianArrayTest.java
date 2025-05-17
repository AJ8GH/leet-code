package io.github.aj8gh.leetcode.leet.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MedianArrayTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(
            new int[] {1, 3},
            new int[] {2},
            2.0
        ),
        Arguments.of(
            new int[] {1, 2},
            new int[] {3, 4},
            2.5
        ),
        Arguments.of(
            new int[] {1, 2},
            new int[] {1, 2, 3},
            2.0
        ),
        Arguments.of(
            new int[] {},
            new int[] {1},
            1.0
        ),
        Arguments.of(
            new int[] {},
            new int[] {2, 3},
            2.5
        ),
        Arguments.of(
            new int[] {100001},
            new int[] {100000},
            100000.5
        ),
        Arguments.of(
            new int[] {2, 3, 4},
            new int[] {1},
            2.5
        )
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void findMedianSortedArrays(int[] nums1, int[] nums2, double expected) {
    var medianArray = new MedianArray();
    var actual = medianArray.findMedianSortedArrays(nums1, nums2);
    assertEquals(expected, actual);
  }
}
