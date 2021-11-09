package com.main;

import org.junit.jupiter.api.Test;

import java.awt.desktop.QuitEvent;

import static org.junit.jupiter.api.Assertions.*;

class QuicksortTest {
    @Test
    public void quickSortTest1() {
        Quicksort quicksort = new Quicksort();
        int[] input = new int[] {1, 0, -1, 0, 3, 2};
        quicksort.quickSort(input, 0, 5);

        for (int i : input) {
            System.out.println(i);
        }
    }
}