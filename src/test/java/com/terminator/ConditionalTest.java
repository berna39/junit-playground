package com.terminator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionalTest {

    @Test
    @EnabledOnOs(OS.MAC)
    @DisplayName("OS Conditional test")
    void specificOS(){
        assertEquals(2, 2);
    }
}
