package google.dp.leetcode_416;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solutionToTest;

    @BeforeEach
    void setUp() {
        solutionToTest = new Solution();
    }

    @Test
    void canPartition() {
        int[] nums = {23,13,11,7,6,5,5};
        solutionToTest.canPartition(nums);
    }
}