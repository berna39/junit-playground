package com.terminator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// By default, an instance of MyArraysTest class will be created before the execution of each method
// If I want It to be created one I should just add @TestInstance annotation with
// TestInstance.Lifecycle.PER_CLASS parameter
class MyArraysTest {

    Ninja ninja = new Ninja();

    // This method will run even before the Test class instance is created
    @BeforeAll
    static void setUp() {
        System.out.println("Setting up the Test");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Closing the Testing session");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("--------- Test -----------");
    }

    @AfterEach
    void afterEach(){
        System.out.println("--------- End Test -----------");
    }

    @Test
    void getSquad() {
        assertArrayEquals(new String[]{"Itachi", "Deisara", "Nagato", "Yahiko"}, ninja.getSquad());
    }
}