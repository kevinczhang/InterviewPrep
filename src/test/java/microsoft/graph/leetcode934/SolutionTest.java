package microsoft.graph.leetcode934;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @DisplayName("Test String matching")
    @Test
    void testCase1() {
        Solution solToTest = new Solution();
        int[][] A = {{0,1},{1,0}};
        assertEquals(1, solToTest.shortestBridge(A));
    }
}