package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day5;

import static io.github.aj8gh.leetcode.helper.ListNodeHelper.toListNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.model.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NodeRemoverTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(toListNode(1), 1, toListNode()),
        Arguments.of(toListNode(1, 2), 1, toListNode(1)),
        Arguments.of(toListNode(1, 2, 3, 4, 5), 2, toListNode(1, 2, 3, 5)),
        Arguments.of(toListNode(1, 2), 2, toListNode(2))
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void removeNthNodeFromEnd(ListNode head, int n, ListNode expected) {
    var nodeRemover = new NodeRemover();
    var actual = nodeRemover.removeNthFromEnd(head, n);
    assertEquals(
        expected == null ? null : expected.toList(),
        actual == null ? null : actual.toList());
  }
}
