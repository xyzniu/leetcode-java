package com.xyzniu.leetcode.array;

/**
 * 999
 */
public class AvailableCapturesForRook {
    
    /**
     * 在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。它们分别以字符 “R”，“.”，“B” 和 “p” 给出。大写字符表示白棋，小写字符表示黑棋。
     * 车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
     * 返回车能够在一次移动中捕获到的卒的数量。
     *
     * @param board
     * @return
     */
    public int numRookCaptures(char[][] board) {
        int ri = 0, rj = 0;
        out:
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    ri = i;
                    rj = j;
                    break out;
                }
            }
        }
        
        return sum1(board, ri, ri, 0, rj - 1) + sum2(board, ri, ri, rj + 1, board[0].length - 1)
                + sum1(board, 0, ri - 1, rj, rj) + sum2(board, ri + 1, board.length - 1, rj, rj);
    }
    
    private int sum1(char[][] board, int istart, int iend, int jstart, int jend) {
        for (int i = iend; i >= istart; i--) {
            for (int j = jend; j >= jstart; j--) {
                if (board[i][j] == '.') {
                    continue;
                } else if (board[i][j] == 'B') {
                    return 0;
                } else if (board[i][j] == 'p') {
                    return 1;
                }
            }
        }
        return 0;
    }
    
    private int sum2(char[][] board, int istart, int iend, int jstart, int jend) {
        for (int i = istart; i <= iend; i++) {
            for (int j = jstart; j <= jend; j++) {
                if (board[i][j] == '.') {
                    continue;
                } else if (board[i][j] == 'B') {
                    return 0;
                } else if (board[i][j] == 'p') {
                    return 1;
                }
            }
        }
        return 0;
    }
    
    
}
