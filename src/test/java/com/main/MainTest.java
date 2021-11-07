package com.main;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void divideBothPositiveNumber() {
        Main main = new Main();
        int result = main.divide(3, 3);
        assertEquals(1, result);
    }

    @Test
    void divideDividendNegativeNumber() {
        Main main = new Main();
        int result = main.divide(-2, 3);
        assertEquals(0, result);
    }

    @Test
    void divideDividendNegativeNumberGetAnser() {
        Main main = new Main();
        int result = main.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    void divideDivisorNegativeNumber() {
        Main main = new Main();
        int result = main.divide(3, -3);
        assertEquals(-1, result);
    }

    @Test
    void divideSpecialCase() {
        Main main = new Main();
        int result = main.divide(-2147483648, -1);
        System.out.println(result);
    }

    @Test
    void divideSpecialCaseSpecialCase() {
        Main main = new Main();
        int result = main.divide(-2147483648, -2147483648);
        assertEquals(1, result);
    }

    @Test
    void divideSpecialCaseBothNegative() {
        Main main = new Main();
        int result = main.divide(-10, -3);
        assertEquals(3, result);
    }

    @Test
    void anotherCase() {
        Main main = new Main();
        int result = main.divide(1026117192, -874002063);
        System.out.println(result);
    }

    @Test
    void testTrees() {
        TreeNode data = constructTreeData();
        Main main = new Main();
        main.flatten(data);
    }

    @Test
    void testTrees1() {
        try {
            List<Integer> a = new LinkedList<>();
            a.add(1);
            a.add(2);
            a.add(3);

            System.out.println(a);
        } catch (Exception e) {
            System.out.println("hurr");
        }
    }

    private TreeNode constructTreeData() {
        return new TreeNode(1,
                new TreeNode(2, new TreeNode(3, null, null),  new TreeNode(4, null, null)),
                new TreeNode(5, null, new TreeNode(4, null, null)));
    }

    @Test
    void frequencySort() {
        Main main = new Main();
        System.out.println(main.frequencySort("heeloo world"));
    }
}