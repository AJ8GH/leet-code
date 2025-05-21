package io.github.aj8gh.leetcode.helper;

import io.github.aj8gh.leetcode.model.ListNode;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ListNodeHelper {

  public static ListNode toListNode(int... digits) {
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
