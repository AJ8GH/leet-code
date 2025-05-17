package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.linkedlist.easy.reverselinkedlist;

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
        Arguments.of(ListNode.of(0, 1, 2, 3), ListNode.of(3, 2, 1, 0)),
        Arguments.of(new ListNode(), new ListNode()),
        Arguments.of(null, null));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(ListNode head, ListNode expected) {
    var actual = subject.solve(head);
    assertThat(actual).isEqualTo(expected);
  }
}
