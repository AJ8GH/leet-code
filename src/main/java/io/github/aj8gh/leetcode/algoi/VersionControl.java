package io.github.aj8gh.leetcode.algoi;

import java.util.SplittableRandom;

public abstract class VersionControl {

  private static final SplittableRandom RANDOM = new SplittableRandom();
  private int badVersion;

  void setBadVersion(int badVersion) {
    this.badVersion = badVersion;
  }

  boolean isBadVersion(int version) {
    return version >= badVersion;
  }
}
