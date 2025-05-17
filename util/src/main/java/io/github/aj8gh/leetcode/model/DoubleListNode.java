package io.github.aj8gh.leetcode.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class DoubleListNode {

  public int val;
  public DoubleListNode next;
  public DoubleListNode previous;

  public DoubleListNode(int val) {
    this.val = val;
  }

  public static DoubleListNode of(int... nums) {
    if (nums == null || nums.length == 0) {
      return null;
    }

    var head = new DoubleListNode(nums[0]);
    var current = head;
    for (int i = 1; i < nums.length; i++) {
      var next = new DoubleListNode(nums[i]);
      current.next = next;
      next.previous = current;
      current = next;
    }
    return head;
  }
}
