package com.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CypherReplaceTest {

    @Test
    void solution1() {
        String cyper = "mpgzkeyrsxfwlvjbcnuidhoqat";
        String alphabet = "helloworld";
        System.out.println(CypherReplace.solution(alphabet, cyper));
    }

    @Test
    void solution2() {
        long[] input = new long[] {1, 2, 3, 4, -1, -1, -1};
        System.out.println(CypherReplace.solution(input));
    }

    @Test
    void solution3() {
        long[] input = new long[] {1, 1, -1, 1, -1};
        System.out.println(CypherReplace.solution(input));
    }
}