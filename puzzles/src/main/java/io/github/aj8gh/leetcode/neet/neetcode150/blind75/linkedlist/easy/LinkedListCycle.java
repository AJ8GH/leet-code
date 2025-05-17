package io.github.aj8gh.leetcode.neet.neetcode150.blind75.linkedlist.easy;

import io.github.aj8gh.leetcode.model.ListNode;

public class LinkedListCycle {

  public boolean solve(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }

    var a = head;
    var b = head.next;
    while (b != null && b.next != null) {
      if (a.equals(b)) {
        return true;
      }
      a = a.next;
      b = b.next.next;
    }

    return false;
  }
}
