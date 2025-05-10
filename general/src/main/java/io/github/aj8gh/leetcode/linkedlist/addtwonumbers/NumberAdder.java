package io.github.aj8gh.leetcode.linkedlist.addtwonumbers;

import io.github.aj8gh.leetcode.domain.ListNode;

class NumberAdder {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode node = new ListNode();
    ListNode currentNode = null;
    int carry = 0;

    while (!(l1 == null && l2 == null && carry == 0)) {
      int x = 0;
      int y = 0;

      if (l1 != null) {
        x = l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        y = l2.val;
        l2 = l2.next;
      }

      int sum = x + y + carry;
      carry = sum / 10;

      if (currentNode == null) {
        node.val = sum % 10;
        currentNode = node;
      } else {
        currentNode.next = new ListNode(sum % 10);
        currentNode = currentNode.next;
      }
    }

    return node;
  }
}
