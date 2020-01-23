package microsoft.backtrack.leetcode_46;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void permute() {
        Solution solToTest = new Solution();
        List<List<Integer>> res = solToTest.permute(new int[]{1, 2, 3});
        assertEquals(6, res.size());
    }
}