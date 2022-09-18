package com.demoqa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnitDemoTest {

    @BeforeAll
    static void setUp() {
        System.out.println("sssss");
    }

    @Test
    void simpleTest() {
        System.out.println("Testik");
        Assertions.assertTrue(3 > 2);
    }

    @AfterAll
    static void tearDown() {
        System.out.println("After");
    }
}
