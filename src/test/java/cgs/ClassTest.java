package cgs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testOne() {
        assertEquals("Hello", TestClassTwo.getHello());
        assertEquals("asdf", TestClassTwo.getHello());
    }


}