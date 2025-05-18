package io.github.aj8gh.leetcode.neet.neetcode150.blind75.slidingwindow.easy;

public class BestTimeToBuyAndSellStock {

  public int solve(int[] prices) {
    var minPrice = prices[0];
    var maxProfit = 0;

    for (int p : prices) {
      minPrice = Math.min(p, minPrice);
      maxProfit = Math.max(maxProfit, p - minPrice);
    }

    return maxProfit;
  }
}
