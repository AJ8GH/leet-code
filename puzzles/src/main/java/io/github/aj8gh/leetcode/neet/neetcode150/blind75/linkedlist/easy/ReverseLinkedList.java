package io.github.aj8gh.leetcode.neet.neetcode150.blind75.linkedlist.easy;

import io.github.aj8gh.leetcode.model.ListNode;

public class ReverseLinkedList {

  public ListNode solve(ListNode head) {
    if (head == null) {
      return null;
    }

    var originalHead = head;
    while (originalHead.next != null) {
      var newHead = originalHead.next;
      originalHead.next = originalHead.next.next;
      newHead.next = head;
      head = newHead;
    }
    return head;
  }
}
