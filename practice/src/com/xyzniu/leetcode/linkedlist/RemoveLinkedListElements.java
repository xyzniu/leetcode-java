package com.xyzniu.leetcode.linkedlist;

/**
 * 203
 */
public class RemoveLinkedListElements {
    
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode h = head;
        while (h != null && h.val == val) {
            h = h.next;
        }
        ListNode prev = h;
        if (h == null) {
            return null;
        }
        ListNode n = h.next;
        while (n != null) {
            while (n != null && n.val == val) {
                n = n.next;
            }
            prev.next = n;
            if (n != null) {
                prev = n;
                n = n.next;
            }
        }
        return h;
    }
    
}
