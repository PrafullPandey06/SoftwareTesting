package com.example.emantrana.DSA.String;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckAnagramsTest {

    @Test
    void testIsAnagrams_True() {
        assertTrue(CheckAnagrams.isAnagrams("Listen", "Silent"));
    }

    @Test
    void testIsAnagrams_False() {
        assertFalse(CheckAnagrams.isAnagrams("Hello", "World"));
    }

    @Test
    void testIsAnagramsUnicode_True() {
        assertFalse(CheckAnagrams.isAnagramsUnicode("Listen", "Silent"));
    }

    @Test
    void testIsAnagramsUnicode_False() {
        assertFalse(CheckAnagrams.isAnagramsUnicode("Hello", "World"));
    }


    @Test
    void testIsAnagramsOptimised_True() {
        assertTrue(CheckAnagrams.isAnagramsOptimised("listen", "silent"));
    }

    @Test
    void testIsAnagramsOptimised_False() {
        assertFalse(CheckAnagrams.isAnagramsOptimised("hello", "world"));
    }


    @Test
    void testCheckLetter_ValidInput() {
        assertDoesNotThrow(() -> CheckAnagrams.checkLetter('a'));
    }

    @Test
    void testCheckLetter_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> CheckAnagrams.checkLetter('A'));
    }


    @Test
    void testIntegration1() {
        assertTrue(CheckAnagrams.isAnagrams("listen", "silent"));
        assertTrue(CheckAnagrams.isAnagramsUnicode("listen", "silent"));
        assertTrue(CheckAnagrams.isAnagramsOptimised("listen", "silent"));
    }

    @Test
    void testIntegration2() {
        assertFalse(CheckAnagrams.isAnagrams("hello", "world"));
        assertFalse(CheckAnagrams.isAnagramsUnicode("hello", "world"));
        assertFalse(CheckAnagrams.isAnagramsOptimised("hello", "world"));
    }
}
