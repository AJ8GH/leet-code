package io.github.aj8gh.leetcode.neet.neetcode150.blind75.linkedlist.easy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import io.github.aj8gh.leetcode.model.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LinkedListCycleTest {

  private final LinkedListCycle subject = new LinkedListCycle();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(ListNode.of(1, 2, 3, 4).withCycleAtIndex(1), true),
        Arguments.of(ListNode.of(0, 7, 3, 5, 4, 8, 15, 2).withCycleAtIndex(3), true),
        Arguments.of(ListNode.of(1, 2), false));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(ListNode head, boolean expected) {
    var actual = subject.solve(head);
    assertThat(actual).isEqualTo(expected);
  }
}
