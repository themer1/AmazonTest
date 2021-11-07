package com.main;


import java.util.List;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode();
        ListNode activeResult = result;
        ListNode prev = activeResult;
        while (l1 != null || l2 != null) {
            int resultElement = (l1 == null ? 0 : l1.val) +
                    (l2 == null ? 0 : l2.val) +
                    carry;
            carry = resultElement / 10;
            resultElement = resultElement % 10;
            if (activeResult == null) {
                activeResult = new ListNode();
                prev.next = activeResult;
            }
            activeResult.val = resultElement;
            prev = activeResult;
            activeResult = activeResult.next;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        if (carry != 0) {
            activeResult = new ListNode();
            activeResult.val = carry;
            prev.next = activeResult;
        }


        return result;
    }
}
