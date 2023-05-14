package com.terminator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class ConditionalTest {

    @Test
    @EnabledOnOs(OS.MAC)
    @DisplayName("OS Conditional test")
    void specificOS(){
        assertEquals(2, 2);
    }


    @Test
    void assumption(){
        Boolean imCool = true;
        assumeTrue(imCool); //  if this is false the test will be skipped
        assertEquals("Toby", "Toby");
    }
}
