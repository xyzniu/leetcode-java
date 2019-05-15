package com.xyzniu.leetcode.linkedlist;

/**
 * 206
 */
public class ReverseLinkedList {
    
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode one = head;
        if (one == null) {
            return null;
        }
        ListNode next = one.next;
        while (next != null) {
            one.next = prev;
            prev = one;
            one = next;
            next = next.next;
        }
        one.next = prev;
        return one;
    }
}
