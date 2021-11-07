package com.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyGameTest {
    @Test
    public void largeButMinFreq() {
        assertEquals(4, FrequencyGame.LargButMinFreq(new int[] {4, 1, 2, 2, 3}, 4));
    }

    @Test
    public void largeButMinFreq1() {
        assertEquals(4, FrequencyGame.LargButMinFreq(new int[] {4, 1, 2, 2, 3, 5, 5, 6, 6, 6}, 4));
    }

    @Test
    public void largeButMinFreq2() {
        assertEquals(4, FrequencyGame.LargButMinFreq(new int[] {3, 4, 5, 5, 6, 6}, 1));
    }

}