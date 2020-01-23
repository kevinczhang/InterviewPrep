package microsoft.backtrack.leetcode_79;

public class Solution {
    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0) return true;

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] != word.charAt(0)) {
                    continue;
                }
                boolean[][] visited = new boolean[board.length][board[0].length];
                if (findWord(board, visited, word, row, col, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean findWord(char[][] board, boolean[][] visited, String word, int row, int col, int start) {
        if(start == word.length()) {
            return true;
        }
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return false;
        }

        if (!visited[row][col] && board[row][col] == word.charAt(start++)) {
            visited[row][col] = true;
            boolean res = findWord(board, visited, word, row - 1, col, start) ||
                    findWord(board, visited, word, row, col - 1, start) ||
                    findWord(board, visited, word, row + 1, col, start) ||
                    findWord(board, visited, word, row, col + 1, start);
            visited[row][col] = false;
            return res;
        }
        return false;
    }
}
