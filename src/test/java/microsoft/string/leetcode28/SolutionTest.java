package microsoft.string.leetcode28;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @DisplayName("Test String matching")
    @Test
    void strStr() {
        Solution solToTest = new Solution();
        String haystack = "hello";
        String needle = "ll";
        assertEquals(2, solToTest.strStr(haystack, needle));
    }
}