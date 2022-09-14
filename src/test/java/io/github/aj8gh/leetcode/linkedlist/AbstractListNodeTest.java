package io.github.aj8gh.leetcode.linkedlist;

public abstract class AbstractListNodeTest {
  protected static ListNode toListNode(int... digits) {
    if (digits.length == 0) {
      return null;
    }
    ListNode node = new ListNode();
    ListNode currentNode = node;
    for (int i = 0; i < digits.length; i++) {
      currentNode.val = digits[i];
      if (i < digits.length - 1) {
        currentNode.next = new ListNode();
        currentNode = currentNode.next;
      }
    }
    return node;
  }
}
