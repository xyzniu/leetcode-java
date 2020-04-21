package com.xyzniu.leetcode;

public class DeleteNode {
    
    
    private class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) {
            val = x;
        }
    }
    
    
    public void deleteNode(ListNode node) {
        ListNode one = node;
        ListNode next = node.next;
        while (next.next != null) {
            one.val = next.val;
            one = next;
            next = next.next;
        }
        one.val = next.val;
        one.next = null;
    }
}
