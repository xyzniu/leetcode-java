package com.xyzniu.leetcode;

import com.xyzniu.leetcode.linkedlist.ListNode;

public class ReverseList {
    
    
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode one = head;
        ListNode next = head.next;
        one.next = null;
        
        while (next != null) {
            ListNode node = next.next;
            next.next = one;
            one = next;
            next = node;
        }
        return one;
    }
    
}
