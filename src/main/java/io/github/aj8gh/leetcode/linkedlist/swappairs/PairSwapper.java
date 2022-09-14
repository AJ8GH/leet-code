package io.github.aj8gh.leetcode.linkedlist.swappairs;

import io.github.aj8gh.leetcode.linkedlist.ListNode;

public class PairSwapper {
  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) return head;
    var current = head;
    var nodeToReturn = head.next;
    ListNode previous = null;
    while (current != null && current.next != null) {
      var next = current.next; // 2
      var nextNext = current.next.next; // 3
      next.next = current; // 1
      if (previous != null) {
        previous.next = next;
      }
      current.next = nextNext;
      previous = current;
      current = nextNext;
    }
    return nodeToReturn;
  }
}
