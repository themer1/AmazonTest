package com.main;

import java.util.*;

public class GenerateParenthesis {

    public Set<String> allParenthesis(int n) {
        if (n <= 0) {
            return new HashSet<String>();
        }
        if (n == 1) {
            return new HashSet<>(Collections.singleton("()"));
        } else {
            Set<String> outputFromDownstream = allParenthesis(n-1);
            Set<String> output = new HashSet<>();
            for (String str : outputFromDownstream) {
                output.add("(" + str +  ")");
                output.add("()" + str);
                output.add(str + "()");
            }
            return output;
        }
    }
    public List<String> AllParenthesis(int n)
    {
        return new ArrayList<>(allParenthesis(n));
    }
}
