package com.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @Test
    public void removeDuplicates() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(new int[] {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}