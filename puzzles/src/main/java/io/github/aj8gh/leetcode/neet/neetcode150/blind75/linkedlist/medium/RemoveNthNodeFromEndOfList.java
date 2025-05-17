package io.github.aj8gh.leetcode.neet.neetcode150.blind75.linkedlist.medium;

import io.github.aj8gh.leetcode.model.ListNode;

public class RemoveNthNodeFromEndOfList {

  public ListNode solve(ListNode head, int n) {
    if (head == null) {
      return null;
    }

    var size = 0;
    for (var current = head; current != null; current = current.next) {
      size++;
    }
    if (n == size) {
      return head.next;
    }

    var current = head;
    ListNode previous = null;
    for (var j = 0; j < size - n; j++) {
      previous = current;
      current = current.next;
    }
    previous.next = current.next;
    return head;
  }
}
