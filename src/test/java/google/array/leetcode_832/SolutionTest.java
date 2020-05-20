package google.array.leetcode_832;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static int[][] A;

    @BeforeEach
    void setUp() {
        A = new int[][]{
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
    }

    @Test
    void flipAndInvertImage() {
        Solution solution = new Solution();
        int[][] res = solution.flipAndInvertImage(A);
        assertEquals(1, res[0][0]);
    }
}