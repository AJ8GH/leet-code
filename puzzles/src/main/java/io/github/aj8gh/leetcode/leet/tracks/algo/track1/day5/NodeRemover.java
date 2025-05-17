package io.github.aj8gh.leetcode.leet.tracks.algo.track1.day5;

import io.github.aj8gh.leetcode.model.ListNode;
import java.util.ArrayList;

public class NodeRemover {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head.next == null) {
      return null;
    }
    var nodes = new ArrayList<ListNode>();
    var current = head;
    while (current != null) {
      nodes.add(current);
      current = current.next;
    }
    if (n == nodes.size()) {
      return head.next;
    }
    var previous = nodes.get(nodes.size() - n - 1);
    var nth = nodes.get(nodes.size() - n);
    previous.next = nth.next;

    return head;
  }
}
