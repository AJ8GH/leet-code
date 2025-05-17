package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.linkedlist.medium.reorderlinkedlist;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.aj8gh.leetcode.model.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution subject = new Solution();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(ListNode.of(2, 4, 6, 8), ListNode.of(2, 8, 4, 6)),
        Arguments.of(ListNode.of(2, 4, 6, 8, 10), ListNode.of(2, 10, 4, 8, 6)));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(ListNode head, ListNode expected) {
    subject.solve(head);
    assertThat(head.toList()).isEqualTo(expected.toList());
  }
}
