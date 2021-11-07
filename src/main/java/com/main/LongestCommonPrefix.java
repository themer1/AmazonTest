package com.main;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;

        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            boolean isAllEqual = true;
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j+1].charAt(i)) {
                    isAllEqual = false;
                    break;
                }
            }
            if (isAllEqual) {
                output.append(strs[0].charAt(i));
            } else break;
        }
        return output.toString();
    }
}
