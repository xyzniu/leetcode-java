package com.xyzniu.leetcode.linkedlist;

/**
 * 2
 */
public class AddTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode one = head;
        int prev = 0;
        while (l1 != null && l2 != null) {
            int num = l1.val + l2.val + prev;
            one.next = new ListNode(num % 10);
            one = one.next;
            prev = num / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int num = l1.val + prev;
            one.next = new ListNode(num % 10);
            one = one.next;
            prev = num / 10;
            l1 = l1.next;
        }
        while (l2 != null) {
            int num = l2.val + prev;
            one.next = new ListNode(num % 10);
            one = one.next;
            prev = num / 10;
            l2 = l2.next;
        }
        if (prev != 0) {
            one.next = new ListNode(prev);
        }
        return head.next;
    }
    
}
