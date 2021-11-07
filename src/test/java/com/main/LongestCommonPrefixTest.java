package com.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    LongestCommonPrefix toTest = new LongestCommonPrefix();

    @Test
    public void longestCommonPrefix() {
        String[] strs = {"fool","feel","fuul"};
        System.out.println(toTest.longestCommonPrefix(strs));
    }
}