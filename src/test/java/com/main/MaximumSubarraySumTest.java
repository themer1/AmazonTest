package com.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarraySumTest {

    @Test
    void solution1() {
        long input = 123l;
        MaximumSubarraySum sum = new MaximumSubarraySum();
        assertEquals(132l, sum.solution(input));
    }

    @Test
    void solution2() {
        long input = 23l;
        MaximumSubarraySum sum = new MaximumSubarraySum();
        assertEquals(32l, sum.solution(input));
    }

    @Test
    void solution3() {
        long input = 511l;
        MaximumSubarraySum sum = new MaximumSubarraySum();
        assertEquals(-1l, sum.solution(input));
    }

    @Test
    void solution4() {
        long input = 1l;
        MaximumSubarraySum sum = new MaximumSubarraySum();
        assertEquals(-1l, sum.solution(input));
    }

    @Test
    void solution5() {
        long input = -142l;
        MaximumSubarraySum sum = new MaximumSubarraySum();
        assertEquals(-1l, sum.solution(input));
    }
}