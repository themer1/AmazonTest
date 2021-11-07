package com.main;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TextJustificationTest {

    @Test
    void fullJustify() {
        TextJustification justification = new TextJustification();
        String[] input = new String[]{"hello", "hello    world"};
        List<String> justifiedStrings = justification.fullJustify(input,
                justification.getMaxLength(input));

        for (String s : justifiedStrings) {
            System.out.println(s);
        }
    }

    @Test
    void getMaxLength() {
        TextJustification justification = new TextJustification();
        int maxLength = justification.getMaxLength(new String[] {"h", ""});
        System.out.println(maxLength);
    }
}