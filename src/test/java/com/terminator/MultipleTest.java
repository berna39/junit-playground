package com.terminator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class MultipleTest {

    @Test
    @DisplayName("multiple assertions at once")
    void testMultiple(){
        int a = 5;
        assertAll(
                () -> assertEquals(10, a + a),
                () -> assertEquals(0, a - a),
                () -> assertEquals(25, a * a),
                () -> assertEquals(1, a / a)
        ); // if one test fails, all the test will fail
    }

    @Nested
    class GroupTest{
        // if one test fails, all the test will fail

        @Test
        @DisplayName("when testing addition")
        void additionTest(){
            int a = 5;
            assertEquals(10, a + a);
        }

        @Test
        @DisplayName("when testing sub")
        void subTest(){
            int a = 5;
            assertEquals(0, a - a);
        }

        @Test
        @DisplayName("when testing multiply")
        void multiplyTest(){
            int a = 5;
            assertEquals(25, a * a);
        }

        @Test
        @DisplayName("when testing divide")
        void divideTest(){
            int a = 5;
            assertEquals(1, a / a);
        }
    }
}
