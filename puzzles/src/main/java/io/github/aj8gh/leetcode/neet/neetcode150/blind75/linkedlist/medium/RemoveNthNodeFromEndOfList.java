package io.github.aj8gh.leetcode.neet.neetcode150.blind75.linkedlist.medium;

import io.github.aj8gh.leetcode.model.ListNode;

public class RemoveNthNodeFromEndOfList {

  public ListNode solve(ListNode head, int n) {
    if (head == null) {
      return null;
    }

    var i = 0;
    var first = head;
    for (var second = head; second != null; second = second.next) {
      if (++i > n + 1) {
        first = first.next;
      }
    }

    if (first == head) {
      if (n == 1 && i > 1) {
        head.next = null;
        return head;
      }
      return head.next;
    }

    first.next = first.next.next;
    return head;
  }
}
