package com.terminator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultipleTest {

    @Test
    @DisplayName("Multiple assertions at once")
    void testMultiple(){
        int a = 5;
        assertAll(
                () -> assertEquals(10, a + a),
                () -> assertEquals(0, a - a),
                () -> assertEquals(25, a * a),
                () -> assertEquals(1, a / a)
        ); // if one test fails, all the test will fail
    }
}
