package com.main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.reverseOrder;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Main {

    public void solve() {

    }

    /*https://leetcode.com/problems/divide-two-integers/*/
    //3 div 3 = 1
    int divide(int dividend, int divisor) {
        boolean isNegative = false;
        boolean wasMinInt = false;
        if (divisor == 1) {
            return dividend;
        }
        if (dividend == Integer.MIN_VALUE && divisor == Integer.MIN_VALUE) {
            return 1;
        } else if (divisor == Integer.MIN_VALUE) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE) {
            dividend = Integer.MAX_VALUE;
            isNegative = true;
            wasMinInt = true;
        }
        if (dividend < 0) {
            dividend *= -1;
            isNegative = true;
        }
        if (divisor < 0) {
            divisor *= -1;
            isNegative = !isNegative;
        }
        if (divisor > dividend) {
            return 0;
        }
        int result = 0;
        int tenX = divisor;
        int x = 1;
        for (int i = 0; i < 512; i++) {
            if (Integer.MAX_VALUE - tenX < divisor) {
                break;
            }
            tenX += divisor;
            x += 1;
        }
        while (dividend >= tenX) {
            dividend -= tenX;
            if (wasMinInt) {
                dividend += 1;
                wasMinInt = false;
            }
            result += x;
        }
        while (dividend >= divisor) {
            dividend -= divisor;
            result += 1;
        }
        if (isNegative) {
            result *= -1;
        }
        return result;
    }

    TreeNode list = null;
    TreeNode list1 = list;
    private void flattenAux(TreeNode root) {
        if (root == null) {
            return;
        }
        list = new TreeNode(root.val, null, null);
        list.right = null;
        list.left = null;
        list = list.right;
        flatten(root.left);
        flatten(root.right);
    }
    /*Flatten binary tree to LinkedList [Medium] https://leetcode.com/problems/flatten-binary-tree-to-linked-list/*/
    public void flatten(TreeNode root) {
        flattenAux(root);
        root = list1;
    }

    static int count = 0;
    public static void main(String[] args) {
        if (count < 3) {
            count ++;
            main(null);
        } else {
            return;
        }
        System.out.println("hello world");
    }

    /*Sort characters based on frequencey*/
    public String frequencySort(String s) {
        Map<Character, Long> values = frequencyMap(s.chars().mapToObj(c -> (char)c));
        return values.entrySet().stream().map(this::append)
            .collect(Collectors.joining());
    }

    public String append(Map.Entry<Character, Long> entry){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < entry.getValue(); i++) {
            result.append(entry.getKey());
        }
        return result.toString();
    }

    public static <Character> Map<Character, Long> frequencyMap(Stream<Character> elements) {
        return elements.collect(
            Collectors.groupingBy(Function.identity(),
                    TreeMap::new, Collectors.counting()
            )
        ).entrySet()
            .stream()
            .sorted(reverseOrder(comparingByValue()))
            .collect(
                toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                LinkedHashMap::new));
    }
    /*End program*/
}
