package com.terminator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputationTest {

    @Test
    void test(){
        Computation computation = new Computation();
        assertEquals(5, computation.addition(3, 2));
    }
}