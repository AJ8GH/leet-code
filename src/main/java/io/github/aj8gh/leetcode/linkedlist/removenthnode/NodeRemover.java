package io.github.aj8gh.leetcode.linkedlist.removenthnode;

import java.util.ArrayDeque;

public class NodeRemover {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    var currentNode = head;
    var queue = new ArrayDeque<ListNode>();

    while (currentNode.next != null) {
      queue.push(currentNode);
    }
    ListNode previous = null;
    ListNode current = null;
    for (int i = 0; i < n; i++) {
      previous = current;
      current = queue.pop();
    }
    current.next = previous.next;
    return head;
  }
}
