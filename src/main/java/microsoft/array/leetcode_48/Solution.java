package microsoft.array.leetcode_48;

public class Solution {
    public void rotate(int[][] matrix) {
        int start = 0;
        int end = matrix.length -1;

        while (start < end) {
            rotateOuter(matrix, start++, end--);
        }
    }

    private void rotateOuter(int[][] matrix, int start, int end) {
        for (int i = 0; i < end - start; i++) {
            swap(matrix, start, start + i, end - i, start);
            swap(matrix, end - i, start, end, end - i);
            swap(matrix, end, end - i, start + i, end);
        }
    }

    private void swap(int[][] matrix, int i, int j, int k, int l) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[k][l];
        matrix[k][l] = temp;
    }
}
