package io.github.aj8gh.leetcode.model;

import java.util.HashMap;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ListNode {

  public int val;
  public ListNode next;

  public ListNode(Integer val) {
    this.val = val;
  }

  public static ListNode of(int... nums) {
    if (nums == null || nums.length == 0) {
      return new ListNode();
    }

    var head = new ListNode(nums[0]);
    var current = head;
    for (int i = 1; i < nums.length; i++) {
      current.next = new ListNode(nums[i]);
      current = current.next;
    }
    return head;
  }

  public ListNode withCycleAtIndex(int k) {
    var i = 0;
    var current = this;
    var startOfCycle = this;
    while (current.next != null) {
      if (i == k) {
        startOfCycle = current;
      }
      current = current.next;
      i++;
    }
    current.next = startOfCycle;
    return this;
  }

  @Override
  public String toString() {
    var nodes = new HashMap<ListNode, Integer>();
    nodes.put(this, 0);
    var s = new StringBuilder("[").append(val);
    var current = next;
    var i = 1;
    while (current != null) {
      if (nodes.containsKey(current)) {
        s.append(" -> cycle to index {%d}".formatted(nodes.get(current)));
        break;
      }
      nodes.put(current, i);
      s.append(", ").append(current.val);
      current = current.next;
      i++;
    }
    return s.append("]").toString();
  }
}
