package io.github.aj8gh.leetcode.algoi;

public class BadVersionChecker extends VersionControl {

  public int firstBadVersion(int n) {
    int firstBadVersion = 0;
    int upper;
    int lower;

    do {
      if (isBadVersion(n)) {
        if (isBadVersion(n - 1)) {
          return n - 1;
        }
        firstBadVersion = n;
        upper = n;
        lower = n / 2;
      } else {
        upper = n * 2;
        lower = n;
      }
      n = lower + ((upper - lower) / 2);
    } while (upper - lower > 1);
    return firstBadVersion;
  }

  @Override
  public void setBadVersion(int badVersion) {
    super.setBadVersion(badVersion);
  }
}
