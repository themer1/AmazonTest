package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CypherReplace {
    public static String solution(String word, String cipher) {
        char[] cyperChars = cipher.toCharArray();
        if (cyperChars.length != 26) {
            return "";
        }

        char[] wordChar = word.toCharArray();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < wordChar.length; i++) {
            if (wordChar[i] - 97 < 0 || wordChar[i] - 97 > 26) {
                return "";
            }
            result.append(cyperChars[wordChar[i] - 97]);
        }
        return result.toString();
    }

    public static long solution(long[] tree) {


        List<Long> treeList = new ArrayList<>();

        for (int i = 0; i < tree.length; i++) {
            if (tree[i] != -1)
            treeList.add(tree[i]);
        }

        if (treeList.size() == 1) {
            return 1l;
        } else if (treeList.size() <= 3) {
            return 2l;
        } else if (treeList.size() == 4) {
            return 3l;
        }
        return Long.valueOf(treeList.size() / 2);
    }
}

