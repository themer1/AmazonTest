package com.main;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesisTest {

    @Test
    void allParenthesis1() {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        List<String> perenthesis = generateParenthesis.AllParenthesis(3);
        perenthesis.forEach(System.out::println);
    }

    @Test
    void allParenthesis2() {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        List<String> perenthesis = generateParenthesis.AllParenthesis(2);
        perenthesis.forEach(System.out::println);
    }

    @Test
    void allParenthesis3() {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        List<String> perenthesis = generateParenthesis.AllParenthesis(4);
        System.out.println(perenthesis.size());
    }

}