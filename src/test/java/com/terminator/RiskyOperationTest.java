package com.terminator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RiskyOperationTest {

    @Test
    @DisplayName("Testing Exception")
    void jumpFromPlane() {
        RiskyOperation riskyOperation = new RiskyOperation();
        assertThrows(Exception.class, () -> riskyOperation.jumpFromPlane(true));
    }
}