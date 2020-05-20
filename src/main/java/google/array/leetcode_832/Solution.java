package google.array.leetcode_832;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= (m - 1) / 2; j++) {
                if ((A[i][j] ^ A[i][m - j - 1]) == 0) {
                    if (A[i][j] == 0) {
                        A[i][j] = 1;
                        A[i][m - j - 1] = 1;
                    } else {
                        A[i][j] = 0;
                        A[i][m - 1 - j] = 0;
                    }
                }
            }
        }
        return A;
    }
}
