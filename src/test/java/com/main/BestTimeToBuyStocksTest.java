package com.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyStocksTest {
    BestTimeToBuyStocks bestTimeToBuyStocks = new BestTimeToBuyStocks();

    @Test
    public void testBestTimeToBuyStocksSingleInputs() {
        int[] stocks = {1, 2, 3, 4};
        int expectedOutput = 3;
        int actualOutput = bestTimeToBuyStocks.maxProfit(stocks);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testBestTimeToBuyStocksSingleInputs1() {
        int[] stocks = {1, 2, 4, 3};
        int expectedOutput = 3;
        int actualOutput = bestTimeToBuyStocks.maxProfit(stocks);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testBestTimeToBuyStocksSingleInputs2() {
        int[] stocks = {4, 1, 2, 3};
        int expectedOutput = 2;
        int actualOutput = bestTimeToBuyStocks.maxProfit(stocks);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testBestTimeToBuyStocksSingleInputs3() {
        int[] stocks = {7, 1, 5, 3, 6, 4};
        int expectedOutput = 5;
        int actualOutput = bestTimeToBuyStocks.maxProfit(stocks);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testBestTimeToBuyStocksSingleInputs4() {
        int[] stocks = {2, 1, 4};
        int expectedOutput = 3;
        int actualOutput = bestTimeToBuyStocks.maxProfit(stocks);
        assertEquals(expectedOutput, actualOutput);
    }
}