package com.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbers243And564() {
        ListNode number1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode number2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(number1, number2);
        int[] expectedResult = new int[] {7, 0, 8};

//        for (int expectedResultElem : expectedResult) {
//            assertEquals(expectedResultElem, result.val);
//            result = result.next;
//        }

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    @Test
    void addTwoNumbers999And999() {
        ListNode number1 = new ListNode(9, new ListNode(9, new ListNode(9, null)));
        ListNode number2 = new ListNode(9, new ListNode(9, new ListNode(9, null)));

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(number1, number2);
        int[] expectedResult = new int[] {8, 9, 9, 1};

//        for (int expectedResultElem : expectedResult) {
//            assertEquals(expectedResultElem, result.val);
//            result = result.next;
//        }

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    @Test
    void addTwoNumbers999And9() {
        ListNode number1 = new ListNode(9, new ListNode(9, new ListNode(9, null)));
        ListNode number2 = new ListNode(9, null);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(number1, number2);
        int[] expectedResult = new int[] {8, 9, 9, 1};

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    @Test
    void addTwoNumbers999And9Opp() {
        ListNode number1 = new ListNode(9, new ListNode(9, new ListNode(9, null)));
        ListNode number2 = new ListNode(9, null);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(number2, number1);
        int[] expectedResult = new int[] {8, 9, 9, 1};

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}