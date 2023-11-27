package com.example.emantrana.DSA.String;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    // Unit Test 1: Verify null string is palindrome
    @Test
    void testIsPalindrome_NullString() {
        assertTrue(Palindrome.isPalindrome(null));
    }

    @Test
    void testIsPalindromeRecursion_NullString() {
        assertTrue(Palindrome.isPalindromeRecursion(null));
    }

    // Unit Test: Verify isPalindromeRecursion handles empty string
    @Test
    void testIsPalindromeRecursion_EmptyString() {
        assertTrue(Palindrome.isPalindromeRecursion(""));
    }

    // Additional Unit Test: Verify isPalindromeRecursion handles single-character string
    @Test
    void testIsPalindromeRecursion_SingleCharacterString() {
        assertTrue(Palindrome.isPalindromeRecursion("a"));
    }

    @Test
    void testIsPalindrome_NullOrEmptyString() {
        assertTrue(Palindrome.isPalindrome(null));
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testIsPalindrome_NonPalindromeString() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    void testIsPalindrome_SingleCharacterPalindrome() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    void testIsPalindrome_EmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testIsPalindrome_UsingStringBuilder() {
        assertTrue(Palindrome.isPalindrome("level"));
    }

    @Test
    void testIsPalindromeRecursion_NonPalindrome() {
        assertFalse(Palindrome.isPalindromeRecursion("hello"));
    }

    @Test
    void testIsPalindromeTwoPointer_PalindromeString() {
        assertTrue(Palindrome.isPalindromeTwoPointer("madam"));
    }

    @Test
    void testIsPalindromeTwoPointer_NonPalindromeString() {
        assertFalse(Palindrome.isPalindromeTwoPointer("world"));
    }
}
