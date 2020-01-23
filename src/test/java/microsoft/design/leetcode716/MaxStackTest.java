package microsoft.design.leetcode716;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxStackTest {
    @DisplayName("Test LRU Cache")
    @Test
    void testGetAndPut() {
        MaxStack stack = new MaxStack();
        stack.push(5);
        stack.push(1);
        stack.push(5);
        assertEquals(5, stack.top());
        assertEquals(5, stack.popMax());
        assertEquals(1, stack.top());
        assertEquals(5, stack.peekMax());
        assertEquals(1, stack.pop());
        assertEquals(5, stack.top());
    }
}