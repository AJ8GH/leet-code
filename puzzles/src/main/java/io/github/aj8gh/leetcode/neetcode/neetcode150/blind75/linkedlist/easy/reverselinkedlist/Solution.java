package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.linkedlist.easy.reverselinkedlist;

import io.github.aj8gh.leetcode.model.ListNode;

public class Solution {

  public ListNode solve(ListNode head) {
    if (head == null) {
      return null;
    }

    var tail = head;
    while (tail.next != null) {
      var next = tail.next;
      tail.next = tail.next.next;
      next.next = head;
      head = next;
    }
    return head;
  }
}
