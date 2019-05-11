package com.xyzniu.leetcode.linkedlist;

/**
 * 237
 */
public class DeleteNodeInALinkedList {
    
    
    /**
     * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
     *
     * @param node
     */
    public void deleteNode(ListNode node) {
        ListNode prev = node;
        ListNode next = node.next;
        while (next.next != null) {
            prev.val = next.val;
            prev = next;
            next = next.next;
        }
        prev.val = next.val;
        prev.next = null;
    }
    
}
