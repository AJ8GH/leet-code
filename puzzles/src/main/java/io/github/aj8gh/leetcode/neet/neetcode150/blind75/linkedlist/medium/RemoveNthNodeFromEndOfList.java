package io.github.aj8gh.leetcode.neet.neetcode150.blind75.linkedlist.medium;

import io.github.aj8gh.leetcode.model.ListNode;

public class RemoveNthNodeFromEndOfList {

  public ListNode solve(ListNode head, int n) {
    if (head == null) {
      return null;
    }

    var first = head;
    for (int i = 0; i <= n; i++) {
      if (first == null) {
        return head.next;
      }
      first = first.next;
    }

    var second = head;
    while (first != null) {
      first = first.next;
      second = second.next;
    }

    second.next = second.next.next;
    return head;
  }
}
