package io.github.aj8gh.leetcode.model;

public class ListNode {

  public int val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public boolean equals(Object listNode) {
    if (!(listNode instanceof ListNode that)) {
      return false;
    }
    if (this.val != that.val) {
      return false;
    }
    if (this.next != null) {
      return this.next.equals(that.next);
    }
    return that.next == null;
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
