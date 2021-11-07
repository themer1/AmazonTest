package com.main;

public class AmazonAssessment {
    public static int minimumCoinFlips(String coins) {
        return minCoinFlips(coins.toCharArray(), 0, 0);

    }

    public static int minCoinFlips(char[] coins, int currentFlips, int i) {
        if (isBeautiful(coins)) return currentFlips;
        if (i >= coins.length) return currentFlips;

        char[] flippedH = new char[coins.length];
        for (int j = 0; j < flippedH.length; j++) {
            flippedH[j] = coins[j];
        }
        int currentFlipsForH = currentFlips;

        if (coins[i] == 'T') {
            currentFlipsForH++;
        }

        flippedH[i] = 'H';
        int flipH = minCoinFlips(flippedH, currentFlipsForH, ++i);

        int currentFlipsForT = currentFlips;
        char[] flippedT = new char[coins.length];

        for (int j = 0; j < flippedT.length; j++) {
            flippedT[j] = coins[j];
        }
        if (flippedT[i] == 'H') {
            currentFlipsForT++;
        }

        flippedT[i] = 'T';

        int flipT = minCoinFlips(flippedT, currentFlipsForT, ++i);

        if (flipH < flipT) {
            return flipH;
        } else return flipT;
    }

    public static boolean isBeautiful(char[] coins) {
        boolean isTail = false;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == 'T') {
                isTail = true;
            }

            if (isTail && (coins[i] == 'H')) {
                return false;
            }

        }
        return true;
    }
}
