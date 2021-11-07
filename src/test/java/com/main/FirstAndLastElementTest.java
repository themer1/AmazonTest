package com.main;

import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastElementTest {

    @Test
    void searchTarget() {
        FirstAndLastElement element = new FirstAndLastElement();
        int[] input = new int[] {1, 2};
        System.out.println(element.searchTarget(input, 0, input.length - 1, 2));
    }

    @Test
    void searchRange() {
        FirstAndLastElement element = new FirstAndLastElement();
        int[] input = new int[] {1, 2, 2, 2, 2, 3, 3, 5};
        int[] result = element.searchRange(input, 5);
        for (int res : result) {
            System.out.println(res);
        }
    }

    @Test
    void searchRange1() {
        FirstAndLastElement element = new FirstAndLastElement();
        int[] input = new int[] {5, 7, 7, 8, 8, 10};
        int[] result = element.searchRange(input, 6);
        for (int res : result) {
            System.out.println(res);
        }
    }
}