package com.xyzniu.leetcode.tree;

/**
 * 427
 */


public class ConstructQuadTree {
    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;
        
        public Node() {
        }
        
        public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
            val = _val;
            isLeaf = _isLeaf;
            topLeft = _topLeft;
            topRight = _topRight;
            bottomLeft = _bottomLeft;
            bottomRight = _bottomRight;
        }
    }
    
    public Node construct(int[][] grid) {
        int[][] sum = constructSum(grid);
        return construct(sum, grid, 0, grid.length - 1, 0, grid[0].length - 1);
    }
    
    private Node construct(int[][] sum, int[][] grid, int top, int bottom, int left, int right) {
        if (top == bottom && left == right) {
            Node n = new Node();
            n.val = grid[top][left] == 1;
            n.isLeaf = true;
            return n;
        }
        int s = 0;
        if (top != 0) {
            s -= sum[top - 1][right];
        }
        if (left != 0) {
            s -= sum[bottom][left - 1];
        }
        if (left != 0 && top != 0) {
            s += sum[top - 1][left - 1];
        }
        s += sum[bottom][right];
        int count = (bottom - top + 1) * (right - left + 1);
        Node n = new Node();
        if (s == 0 || count == s) {
            n.isLeaf = true;
            n.val = count == s;
        } else {
            n.isLeaf = false;
            int topMid = (top + bottom - 1) / 2;
            int leftMid = (left + right - 1) / 2;
            n.topLeft = construct(sum, grid, top, topMid, left, leftMid);
            n.topRight = construct(sum, grid, top, topMid, leftMid + 1, right);
            n.bottomLeft = construct(sum, grid, topMid + 1, bottom, left, leftMid);
            n.bottomRight = construct(sum, grid, topMid + 1, bottom, leftMid + 1, right);
        }
        return n;
    }
    
    private int[][] constructSum(int[][] grid) {
        int[][] rst = new int[grid.length][grid[0].length];
        rst[0][0] = grid[0][0];
        for (int i = 1; i < grid[0].length; i++) {
            rst[0][i] = rst[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < grid.length; i++) {
            rst[i][0] = rst[i - 1][0] + grid[i][0];
        }
        
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                rst[i][j] = grid[i][j] + rst[i - 1][j] + rst[i][j - 1] - rst[i - 1][j - 1];
            }
        }
        return rst;
    }
    
    
}
