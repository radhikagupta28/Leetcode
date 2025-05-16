class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        boolean vis[][] = new boolean[m][n];

        boolean res = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    res = helper(board, i, j, vis, 0, word);
                    if (res)
                        return true;
                }
            }
        }
        return false;
    }

    public boolean helper(char[][] board, int i, int j, boolean vis[][], int idx, String word) {
        if (idx == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || vis[i][j] || board[i][j] != word.charAt(idx)) {
            return false;
        }

        vis[i][j] = true;
        if (helper(board, i + 1, j, vis, idx + 1, word) ||
                helper(board, i - 1, j, vis, idx + 1, word) ||
                helper(board, i, j + 1, vis, idx + 1, word) ||
                helper(board, i, j - 1, vis, idx + 1, word)) {
            return true;
        }

        vis[i][j] = false;
        return false;
    }
}