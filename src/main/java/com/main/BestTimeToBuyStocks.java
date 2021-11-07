package com.main;

public class BestTimeToBuyStocks {
    public int maxProfit(int[] prices) {
        int gap = 0;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minVal) {
                minVal = prices[i];
            } else if (prices[i] - minVal > gap) {
                gap = prices[i] - minVal;
            }
        }
        return gap;
    }
}
