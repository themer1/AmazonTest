package com.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaveArrayTest {

    @Test
    public void convertToWave1() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        WaveArray.convertToWave(input, 5);
        for(int n : input) {
            System.out.println(n);
        }
    }
}