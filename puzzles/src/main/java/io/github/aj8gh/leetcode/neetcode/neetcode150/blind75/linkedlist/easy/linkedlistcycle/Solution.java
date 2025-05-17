package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.linkedlist.easy.linkedlistcycle;

import io.github.aj8gh.leetcode.model.ListNode;

public class Solution {

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
