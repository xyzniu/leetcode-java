package com.xyzniu.leetcode;

public class KthToLast {
    
    private class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) {
            val = x;
        }
    }
    
    public int kthToLast(ListNode head, int k) {
        ListNode one = head;
        while (k > 0) {
            one = one.next;
            k--;
        }
        while (one != null) {
            head = head.next;
            one = one.next;
        }
        return head.val;
    }
    
}
