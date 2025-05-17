package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.linkedlist.hard.mergeksortedlists;

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
        Arguments.of(
            new ListNode[] {
                ListNode.of(1, 2, 4),
                ListNode.of(1, 3, 5),
                ListNode.of(3, 6)
            },
            ListNode.of(1, 1, 2, 3, 3, 4, 5, 6)),
        Arguments.of(new ListNode[] {}, null));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(ListNode[] lists, ListNode expected) {
    var actual = subject.solve(lists);
    assertThat(actual == null ? null : actual.toList())
        .isEqualTo(expected == null ? null : expected.toList());
  }
}
