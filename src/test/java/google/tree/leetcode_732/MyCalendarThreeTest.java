package google.tree.leetcode_732;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalendarThreeTest {

    MyCalendarThree solutionToTest;

    @BeforeEach
    void setUp() {
        solutionToTest = new MyCalendarThree();
    }

    @Test
    void book() {
        solutionToTest.book(10, 20); // returns 1
        solutionToTest.book(50, 60); // returns 1
        solutionToTest.book(10, 40); // returns 2
        solutionToTest.book(5, 15); // returns 3
        solutionToTest.book(5, 10); // returns 3
        solutionToTest.book(25, 55); // returns 3
    }
}