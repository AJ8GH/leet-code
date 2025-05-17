package io.github.aj8gh.leetcode.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
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

  @Override
  public String toString() {
    var s = new StringBuilder("[").append(val);
    var current = next;
    while (current != null) {
      s.append(",").append(current.val);
      current = current.next;
    }
    return s.append("]").toString();
  }
}
