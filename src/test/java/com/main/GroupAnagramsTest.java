package com.main;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void groupAnagramsTest() {
        String[] strs = new String[] {"abc", "acb", "aaa"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> output = groupAnagrams.groupAnagrams(strs);
        for (List<String> list : output) {
            System.out.print("[");
            for (String element : list) {
                System.out.print(element + " ");
            }
            System.out.println("]");
        }
    }

    @Test
    void groupAnagramsTes1t() {
        String[] strs = new String[] {"ba", "ab", "ba", "ab", "bac"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> output = groupAnagrams.groupAnagrams(strs);
        for (List<String> list : output) {
            System.out.print("[");
            for (String element : list) {
                System.out.print(element + " ");
            }
            System.out.println("]");
        }
    }
}