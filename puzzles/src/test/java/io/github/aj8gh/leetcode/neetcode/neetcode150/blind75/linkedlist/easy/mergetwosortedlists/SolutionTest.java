package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.linkedlist.easy.mergetwosortedlists;

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
        Arguments.of(ListNode.of(1, 2, 4), ListNode.of(1, 3, 5), ListNode.of(1, 1, 2, 3, 4, 5)),
        Arguments.of(new ListNode(), ListNode.of(1, 2), ListNode.of(1, 2)),
        Arguments.of(null, ListNode.of(1, 2), ListNode.of(1, 2)),
        Arguments.of(ListNode.of(1, 2), null, ListNode.of(1, 2)),
        Arguments.of(new ListNode(), new ListNode(), new ListNode()),
        Arguments.of(null, null, null));
  }

  @ParameterizedTest
  @MethodSource("scenarios")
  void test(ListNode l1, ListNode l2, ListNode expected) {
    var actual = subject.solve(l1, l2);
    assertThat(actual.toList()).isEqualTo(expected.toList());
  }
}
