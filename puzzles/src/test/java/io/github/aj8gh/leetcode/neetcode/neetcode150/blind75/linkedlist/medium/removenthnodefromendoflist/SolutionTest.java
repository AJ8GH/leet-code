package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.linkedlist.medium.removenthnodefromendoflist;

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
        Arguments.of(ListNode.of(1, 2, 3, 4), 2, ListNode.of(1, 2, 4)),
        Arguments.of(ListNode.of(5), 1, null),
        Arguments.of(ListNode.of(1, 2), 2, ListNode.of(2)));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(ListNode head, int n, ListNode expected) {
    subject.solve(head, n);
    assertThat(head).isEqualTo(expected);
  }
}
