package io.github.aj8gh.leetcode.linkedlist.swapnodes;

import io.github.aj8gh.leetcode.model.ListNode;
import java.util.ArrayList;

public class NodeSwapper {
  public ListNode swapNodes(ListNode head, int k) {
    if (head.next == null) {
      return head;
    }
    var nodes = new ArrayList<ListNode>();
    var current = head;
    while (current != null) {
      nodes.add(current);
      current = current.next;
    }
    var kthFromStart = nodes.get(k - 1);
    var kthFromEnd = nodes.get(nodes.size() - k);

    if (nodes.size() == 2) {
      kthFromEnd.next = kthFromStart;
      kthFromStart.next = null;
      head = kthFromEnd;
    } else {
      var preKStart = nodes.get(k - 2);
      var preKEnd = nodes.get(nodes.size() - k - 1);

      if (k != nodes.size() / 2.0) {
        preKEnd.next = kthFromStart;
      }
      kthFromStart.next = kthFromEnd.next;
      preKStart.next = kthFromEnd;
      kthFromEnd.next = k == nodes.size() / 2.0 ? kthFromStart : kthFromStart.next;
    }
    return head;
  }
}
