package com.xyzniu.leetcode.tree;

/*
 *1008
 */
public class ConstructBinarySearchTreeFromPreorderTraversal {
    
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder, 0, 1, preorder.length - 1);
    }
    
    private TreeNode bstFromPreorder(int[] preorder, int root, int start, int end) {
        if (root >= start) {
            return null;
        }
        TreeNode t = new TreeNode(preorder[root]);
        if (start > end) {
            return t;
        }
        int left = start;
        int right = end;
        while (left < right) {
            int mid = (left + right) / 2;
            if (preorder[mid] > preorder[root]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        int mid = 0;
        if (preorder[left] > preorder[root]) {
            mid = left - 1;
        } else {
            mid = left;
        }
        if (mid >= end) {
            t.left = bstFromPreorder(preorder, root + 1, start + 1, end);
        } else if (mid < start) {
            t.right = bstFromPreorder(preorder, root + 1, start + 1, end);
        }
        t.left = bstFromPreorder(preorder, root + 1, start + 1, mid);
        t.right = bstFromPreorder(preorder, mid + 1, mid + 2, end);
        return t;
    }
    
}
