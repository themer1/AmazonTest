package com.main;

import java.util.*;

public class ValidPerenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] sChar = s.toCharArray();
        Map<Character, Character> inputs = new HashMap<>();

        inputs.put('}', '{');
        inputs.put(')', '(');
        inputs.put(']', '[');

        for (int i = 0; i < sChar.length; i++) {
            if (inputs.containsKey(sChar[i])) {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == inputs.get(sChar[i])) {
                    stack.pop();
                } else return false;
            } else stack.push(sChar[i]);
        }
        return true;
    }
}
