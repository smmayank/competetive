package com.github.msaxena.leetcode.addtwonumbers;

import java.util.Objects;

/**
 * Class for problem {@link "https://leetcode.com/problems/add-two-numbers/"}
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode result = new ListNode(0);
        ListNode inter = result;
        int carry = 0;
        while (Objects.nonNull(p1) || Objects.nonNull(p2) || carry > 0) {
            int sum = carry;
            if (Objects.nonNull(p1)) {
                sum += p1.val;
                p1 = p1.next;
            }
            if (Objects.nonNull(p2)) {
                sum += p2.val;
                p2 = p2.next;
            }
            carry = sum / 10;
            sum %= 10;
            inter.next = new ListNode(sum);
            inter = inter.next;
        }
        return result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
