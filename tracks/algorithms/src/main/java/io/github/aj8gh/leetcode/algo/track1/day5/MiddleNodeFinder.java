package io.github.aj8gh.leetcode.algo.track1.day5;

import io.github.aj8gh.leetcode.domain.ListNode;
import java.util.ArrayList;

public class MiddleNodeFinder {

  public ListNode middleNode(ListNode head) {
    var current = head;
    var nodes = new ArrayList<ListNode>();
    while (current != null) {
      nodes.add(current);
      current = current.next;
    }
    return nodes.get(nodes.size() / 2);
  }
}
