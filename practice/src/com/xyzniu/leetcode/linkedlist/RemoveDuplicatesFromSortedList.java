package com.xyzniu.leetcode.linkedlist;

/**
 * 83
 */
public class RemoveDuplicatesFromSortedList {
    
    
    public ListNode deleteDuplicates(ListNode head) {
        ListNode l = head;
        while (l != null && l.next != null) {
            while (l.next != null && l.val == l.next.val) {
                l.next = l.next.next;
            }
            l = l.next;
        }
        return head;
    }
    
}
