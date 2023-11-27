package com.example.emantrana.DSA.String;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class KMPTest {


    private String captureOutput(Runnable action) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        action.run();
        System.setOut(System.out); // Reset System.out
        return outputStream.toString().trim();
    }

    @Test
    void testKMP_Search_PatternAtBeginning() {
        String text = "ABABCABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        KMP kmp = new KMP(pattern);
        String output = captureOutput(() -> kmp.search(text));
        assertTrue(output.contains("Pattern found at index 0"));
    }

    @Test
    void testKMP_Search_PatternAtMultiplePositions() {
        String text = "ABABCABABDABABCABABCDABABCABAB";
        String pattern = "ABABCABAB";
        KMP kmp = new KMP(pattern);
        String output = captureOutput(() -> kmp.search(text));
        assertTrue(output.contains("Pattern found at index 0"));
        assertFalse(output.contains("Pattern found at index 11"));
        assertFalse(output.contains("Pattern found at index 22"));
    }

    @Test
    void testKMP_Search_PatternNotFound() {
        String text = "ABABDABACDABCABAB";
        String pattern = "ABABCABAB";
        KMP kmp = new KMP(pattern);
        String output = captureOutput(() -> kmp.search(text));
        assertFalse(output.contains("Pattern found"));
    }

    @Test
    void testKMP_Search_PatternAtEnd() {
        String text = "ABABDABACDABABCABABCABAB";
        String pattern = "ABAB";
        KMP kmp = new KMP(pattern);
        String output = captureOutput(() -> kmp.search(text));
        assertTrue(output.contains("Pattern found at index 20"));
    }

    @Test
    void testKMP_MultipleInstances_PatternFound() {
        String text = "ABABCABABDABABCABABCDABABCABAB";
        String pattern1 = "ABABCABAB";
        String pattern2 = "CDAB";
        KMP kmp1 = new KMP(pattern1);
        KMP kmp2 = new KMP(pattern2);
        String output = captureOutput(() -> {
            kmp1.search(text);
            kmp2.search(text);
        });
        assertTrue(output.contains("Pattern found at index 0"));
        assertFalse(output.contains("Pattern found at index 22"));
    }

    @Test
    void testKMP_MultipleInstances_NoInterference() {
        String text = "ABABCABABDABABCABABCDABABCABAB";
        String pattern1 = "ABABCABAB";
        String pattern2 = "CDAB";
        KMP kmp1 = new KMP(pattern1);
        KMP kmp2 = new KMP(pattern2);
        String output = captureOutput(() -> {
            kmp1.search(text);
            kmp2.search(text);
        });
        assertFalse(output.contains("Pattern found at index 11"));
    }
}
