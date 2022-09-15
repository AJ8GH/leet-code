package io.github.aj8gh.leetcode.algos.algoi;

public class BadVersionChecker extends VersionControl {

  public int firstBadVersion(int n) {
    var isBadVersion = isBadVersion(n);
    if (isBadVersion && !isBadVersion(n -1)) {
      return n;
    }
    int upper = isBadVersion ? n : Integer.MAX_VALUE;
    int lower = isBadVersion ? 0 : n;

    while (upper - lower > 1) {
      int mid = lower + ((upper - lower) / 2);

      if (isBadVersion(mid)) {
        if (!isBadVersion(mid - 1)) {
          return mid;
        }
        upper = mid;
      } else {
        lower = mid;
      }
    }
    return -1;
  }

  @Override
  public void setBadVersion(int badVersion) {
    super.setBadVersion(badVersion);
  }
}
