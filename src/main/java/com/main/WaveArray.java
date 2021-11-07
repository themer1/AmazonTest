package com.main;

import java.util.Arrays;

public class WaveArray {
    public static void convertToWave(int arr[], int n){
        Arrays.sort(arr);
        int temp = 0;
        for (int i = 0; i < arr.length; i+=2) {
            if (i+1 < arr.length) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
}
