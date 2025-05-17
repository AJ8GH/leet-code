package io.github.aj8gh.leetcode.neetcode.neetcode150.blind75.linkedlist.easy.reverselinkedlist;

import io.github.aj8gh.leetcode.model.ListNode;

public class Solution {

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
