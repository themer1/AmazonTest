package com.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    @Test
    public void getInteger() {
        RomanToInteger toTest = new RomanToInteger();
        System.out.println(toTest.romanToInt("DCXXI"));
    }

}