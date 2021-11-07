package com.main;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    Map<Character, Integer> baseLine = new HashMap<>();
    private void loadBadeLine() {
        baseLine.put('I', 1);
        baseLine.put('V', 5);
        baseLine.put('X', 10);
        baseLine.put('L', 50);
        baseLine.put('C', 100);
        baseLine.put('D', 500);
        baseLine.put('M', 1000);
    }
    public int romanToInt(String s) {
        loadBadeLine();
        char[] charInput = s.toCharArray();
        int result = 0;
        for (int i = 0; i < charInput.length; i++) {
            if (i == (charInput.length - 1)) {
                result += baseLine.get(charInput[i]);
                return result;
            } else {
                if (baseLine.get(charInput[i]) < baseLine.get(charInput[i+1])) {
                    result -= baseLine.get(charInput[i]);
                } else {
                    result += baseLine.get(charInput[i]);
                }
            }
        }
        return result;
    }
}
