package com.example.emantrana.DSA.DP;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class LongestPalindromicSubstringTest {
    @Test
    void testLPS() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

        String a = "babad";
        String b = "cbbd";

        String aLPS = lps.LPS(a);
        String bLPS = lps.LPS(b);

        assertEquals("aba", aLPS);
        assertEquals("bb", bLPS);
    }

    @Test
    void testLPSWithEmptyString() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

        String empty = "";
        String emptyLPS = lps.LPS(empty);

        assertEquals("", emptyLPS);
    }

    @Test
    void testLPSWithNull() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

        String nullStr = null;
        String nullLPS = lps.LPS(nullStr);

        assertEquals(null, nullLPS);
    }
}
