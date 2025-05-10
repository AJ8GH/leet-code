package io.github.aj8gh.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class ScheduleMerger {

  public int[][] process(int[][] input) {
    List<int[]> ranges = new ArrayList<>();

    for (int[] range : input) {
      boolean rangeFound = false;

      for (int[] mergedRange : ranges) {
        int min = mergedRange[0];
        int max = mergedRange[1];

        if (range[0] >= min && range[0] <= max) {
          rangeFound = true;
          if (range[1] > max) {
            mergedRange[1] = range[1];
          }
        }
      }
      if (!rangeFound) {
        ranges.add(range);
      }
    }

    return ranges.toArray(new int[0][]);
  }
}

//Coding: Our scheduling system is running out of capacity and we need to do something about it.
//A team member pulled the start and end times for the largest jobs.
//For simplicity, let's just assume each Job has a start and end time that are integers >= 0.
//For example, a job might start at 156 and end at 769.
//Our next step is to merge these ranges so we know when the system was busy.
//Write a function that accepts ranges and outputs all the overlapping ranges.
//Consider a file loaded with ranges, many overlapping:
//1------8     12------------25
//  3--6       12---17                  35-----40
//                16------23
//                   19-----------30
//This would output:
//1------8     12------------------30    35-----40

// [[1, 8], [3, 6]....]
/*
iterate the outer array
check start value
1, 8
check if following start value is overlapping any other start/end
keep track of the max range for each separate range.
if end time of overlapping range is greater than previous end time - overwrite

sort each value into bucket



*/
