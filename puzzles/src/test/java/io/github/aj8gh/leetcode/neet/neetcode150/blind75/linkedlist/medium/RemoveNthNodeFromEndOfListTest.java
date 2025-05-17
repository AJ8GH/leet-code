package io.github.aj8gh.leetcode.neet.neetcode150.blind75.linkedlist.medium;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.aj8gh.leetcode.model.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveNthNodeFromEndOfListTest {

  private final RemoveNthNodeFromEndOfList subject = new RemoveNthNodeFromEndOfList();

  private static Stream<Arguments> scenarios() {
    return Stream.of(
        Arguments.of(ListNode.of(1, 2, 3, 4), 2, ListNode.of(1, 2, 4)),
        Arguments.of(ListNode.of(1, 2, 3, 4), 1, ListNode.of(1, 2, 3)),
        Arguments.of(ListNode.of(1, 2, 3, 4), 4, ListNode.of(2, 3, 4)),
        Arguments.of(ListNode.of(5), 1, null),
        Arguments.of(ListNode.of(5), 1, null),
        Arguments.of(ListNode.of(1, 2), 2, ListNode.of(2)),
        Arguments.of(ListNode.of(1, 2), 1, ListNode.of(1)),
        Arguments.of(ListNode.of(1, 2, 3), 2, ListNode.of(1, 3)));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(ListNode head, int n, ListNode expected) {
    var actual = subject.solve(head, n);
    assertThat(actual == null ? null : actual.toList())
        .isEqualTo(expected == null ? null : expected.toList());
  }
}
