package com.terminator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputationTest {

    @Test
    @DisplayName("Testing addition")
    void testAddition(){
        Computation computation = new Computation();
        assertEquals(5, computation.addition(3, 2), "the excepted result is 5");
    }

    @Test
    @DisplayName("Red Testing addition")
    void redTest(){
        Computation computation = new Computation();
        assertNotEquals(6, computation.addition(3, 2), "the excepted result is 5");
    }
}