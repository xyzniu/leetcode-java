package com.xyzniu.leetcode;

import com.xyzniu.leetcode.linkedlist.ListNode;

public class MergeTwoLists {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode one = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                one.next = l1;
                l1 = l1.next;
            } else {
                one.next = l2;
                l2 = l2.next;
            }
            one = one.next;
        }
        
        if (l1 != null) {
            one.next = l1;
        }
        if (l2 != null) {
            one.next = l2;
        }
        
        return head.next;
    }
}
