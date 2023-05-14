package com.terminator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OtherConceptsTest {

    @Test
    void lazyMessages(){
        String name = "Toby";
        assertEquals("Toby", "Teddy", () -> "The actual name should be Toby");
        // passing an anonymous function is better that providing a string directly because it will be evaluated before the test
        // when a function will be evaluated only if the test fails
    }

    @Test
    @DisplayName("when testing addition")
    @Tag("important") // tagging is all about organizing for better testing
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
    @Tag("important")
    @DisplayName("when testing divide")
    void divideTest(){
        int a = 5;
        assertEquals(1, a / a);
    }
}
