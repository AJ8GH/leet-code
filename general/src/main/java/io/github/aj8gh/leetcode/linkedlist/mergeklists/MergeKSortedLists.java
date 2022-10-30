package io.github.aj8gh.leetcode.linkedlist.mergeklists;

import io.github.aj8gh.leetcode.domain.ListNode;

public class MergeKSortedLists {

  public ListNode mergeKLists(ListNode[] lists) {
    ListNode mergedList = null;
    ListNode mergeCurrent = null;

    boolean empty = false;

    while (!empty) {
      int minNodeIndex = -1;
      int minNodeValue = Integer.MAX_VALUE;
      empty = true;

      for (int i = 0; i < lists.length; i++) {
        var node = lists[i];
        if (node != null) {
          empty = false;
          if (minNodeIndex < 0 || node.val < minNodeValue) {
            minNodeIndex = i;
            minNodeValue = node.val;
          }
        }
      }
      if (empty) {
        break;
      }

      var minNode = lists[minNodeIndex];

      if (mergedList == null) {
        mergedList = minNode;
      } else {
        mergeCurrent.next = minNode;
      }
      mergeCurrent = minNode;

      lists[minNodeIndex] = minNode.next;
    }

    return mergedList;
  }
}
