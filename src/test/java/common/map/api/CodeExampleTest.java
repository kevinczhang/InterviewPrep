package common.map.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CodeExampleTest {

    MapCodeExample codeToTest;

    @BeforeEach
    void setUp() {
        codeToTest = new MapCodeExample();
    }

    @Test
    void runHashMapMethods() {
        codeToTest.runHashMapMethods();
    }

    @Test
    void runTreeMapMethods() {
        codeToTest.runTreeMapMethods();
    }
}