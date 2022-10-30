package io.github.aj8gh.leetcode.array;

import java.util.ArrayDeque;
import java.util.Arrays;

public class MedianArray {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] numsMerge = new int[nums1.length + nums2.length];

    var queue = new ArrayDeque<Integer>();
    for (int i = 0, j = 0; i < Math.max(nums1.length, nums2.length); i++, j++) {
      if (i >= nums1.length) {
        while (!queue.isEmpty() && queue.peek() < nums2[i]) {
          numsMerge[j++] = queue.poll();
        }
        numsMerge[j] = nums2[i];
      } else if (i >= nums2.length) {
        while (!queue.isEmpty() && queue.peek() < nums1[i]) {
          numsMerge[j++] = queue.poll();
        }
        numsMerge[j] = nums1[i];
      } else {
        while (!queue.isEmpty() && queue.peek() < Math.min(nums1[i], nums2[i])) {
          numsMerge[j++] = queue.poll();
        }
        numsMerge[j] = Math.min(nums1[i], nums2[i]);
        queue.offer(Math.max(nums1[i], nums2[i]));
      }
    }
    int i = nums1.length + nums2.length - queue.size();
    while (!queue.isEmpty()) {
      numsMerge[i++] = queue.poll();
    }
    System.out.println(Arrays.toString(numsMerge));
    return numsMerge.length % 2 == 1
        ? numsMerge[numsMerge.length / 2]
        : (numsMerge[numsMerge.length / 2] + numsMerge[(numsMerge.length / 2) - 1]) / 2.0;
  }

  private double findMedian(int[] nums) {
    return nums.length % 2 == 0
        ? (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0 :
        nums[nums.length / 2];
  }

  private int getNextElement(int i, int j, int[] nums1, int[] nums2) {
    if (i >= nums1.length) {
      return nums2[j];
    } else if (j >= nums2.length) {
      return nums1[i];
    }
    return Math.min(nums1[i], nums2[j]);
  }

  private double alt1(int[] nums1, int[] nums2) {
    int[] numsMerge = new int[nums1.length + nums2.length];

    for (int i = 0, j = 0, k = 0; i < Math.max(nums1.length, nums2.length); i++) {
      if (j >= nums1.length) {
        numsMerge[i] = nums2[k++];
      } else if (k >= nums2.length) {
        numsMerge[i] = nums1[j++];
      } else if (nums1[j] <= nums2[k]) {
        numsMerge[i] = nums1[j++];
      } else if (nums2[k] < nums1[j]) {
        numsMerge[i] = nums2[k++];
      }
    }

    System.out.println(Arrays.toString(numsMerge));
    return numsMerge.length % 2 == 1
        ? numsMerge[numsMerge.length / 2]
        : (numsMerge[numsMerge.length / 2] + numsMerge[(numsMerge.length / 2) - 1]) / 2.0;
  }

  private double alt2(int[] nums1, int[] nums2) {
    if (nums1.length == 0) {
      return findMedian(nums2);
    } else if (nums2.length == 0) {
      return findMedian(nums1);
    }
    int medianIndex = (nums1.length + nums2.length) / 2;
    int i = 0;
    int j = 0;
    boolean iWasLastIncrement;

    while (i < nums1.length || j < nums2.length) {
      if (i >= nums1.length || nums2[j] < nums1[i]) {
        j++;
        iWasLastIncrement = false;
      } else {
        i++;
        iWasLastIncrement = true;
      }
      if (i + j == medianIndex) {
        if ((nums1.length + nums2.length) % 2 == 0) {
          return ((iWasLastIncrement ? nums1[i - 1] : nums2[j - 1])
              + getNextElement(i, j, nums1, nums2)) / 2.0;
        } else {
          return getNextElement(i, j, nums1, nums2);
        }
      }
    }
    return -1;
  }
}
