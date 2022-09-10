package io.github.aj8gh.leetcode.linkedlist.addtwonumbers;

public class ListNode {
  int val;
  ListNode next;

  public ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  @Override
  public boolean equals(Object listNode) {
    if (!(listNode instanceof ListNode that)) return false;
    if (this.val != that.val) return false;
    if (this.next != null) return this.next.equals(that.next);
    return that.next == null;
  }
}
