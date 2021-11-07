package com.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPerenthesisTest {
    @Test
    public void testPerenthesis() {
        ValidPerenthesis validPerenthesis = new ValidPerenthesis();
        System.out.println(validPerenthesis.isValid("()"));
    }

}