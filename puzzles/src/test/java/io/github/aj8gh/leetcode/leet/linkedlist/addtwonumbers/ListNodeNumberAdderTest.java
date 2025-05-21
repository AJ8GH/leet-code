package io.github.aj8gh.leetcode.leet.linkedlist.addtwonumbers;

import static io.github.aj8gh.leetcode.helper.ListNodeHelper.toListNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.aj8gh.leetcode.model.ListNode;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ListNodeNumberAdderTest {

  private static Stream<Arguments> inputProvider() {
    return Stream.of(
        Arguments.of(
            toListNode(2, 4, 3),
            toListNode(5, 6, 4),
            toListNode(7, 0, 8)
        ),
        Arguments.of(
            toListNode(9),
            toListNode(1, 9, 9, 9, 9, 9, 9, 9, 9, 9),
            toListNode(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1)
        ),
        Arguments.of(
            toListNode(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 1),
            toListNode(5, 6, 4),
            toListNode(6, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 1)
        )
    );
  }

  @ParameterizedTest
  @MethodSource("inputProvider")
  void addTwoNumbers(ListNode l1, ListNode l2, ListNode expected) {
    var numberAdder = new NumberAdder();
    var actual = numberAdder.addTwoNumbers(l1, l2);
    assertEquals(expected.toList(), actual.toList());
  }
}
