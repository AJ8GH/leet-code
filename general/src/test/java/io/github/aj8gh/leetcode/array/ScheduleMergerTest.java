package io.github.aj8gh.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ScheduleMergerTest {

  @Test
  void process() {
    int[][] input = {{1, 8}, {3, 6}, {12, 25}, {12, 7}, {16, 23}, {19, 30}, {35, 40}};
    int[][] expected = {{1, 8}, {12, 30}, {35, 40}};

    var scheduleMerger = new ScheduleMerger();
    int[][] actual = scheduleMerger.process(input);

    assertArrayEquals(expected, actual);
  }
}
