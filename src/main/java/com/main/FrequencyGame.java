package com.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FrequencyGame {
    /*
     [1,2]
     [2,3]
     [3,1]
     [4,1]
     */
    /*https://practice.geeksforgeeks.org/problems/frequency-game/1/?company[]=Google#*/
    public static int LargButMinFreq(int arr[], int n) {
        TreeMap<Integer, Long> freq = new TreeMap<>(Collections.reverseOrder());
        freq.putAll(Arrays.stream(arr).boxed().collect(Collectors
        .groupingBy(Integer::intValue, Collectors.counting())));

        int currentHighestNumber = Integer.MIN_VALUE;
        long currentLowestFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Long> entry : freq.entrySet()) {
            if (entry.getValue() < currentLowestFrequency) {
                currentHighestNumber = entry.getKey();
                currentLowestFrequency = entry.getValue();
            }
        }
        return currentHighestNumber;
    }
}
