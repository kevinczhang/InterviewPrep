package microsoft.backtrack.leetcode_77;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void combine() {
        Solution solToTest = new Solution();
        List<List<Integer>> res = solToTest.combine(4, 2);
        assertEquals(6, res.size());
    }
}