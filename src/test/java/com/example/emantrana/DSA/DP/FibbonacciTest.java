package com.example.emantrana.DSA.DP;
import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;
public class FibbonacciTest {
    @Test
    void testFibMemo() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.fibMemo(0));
        assertEquals(1, fibonacci.fibMemo(1));
        assertEquals(1, fibonacci.fibMemo(2));
        assertEquals(2, fibonacci.fibMemo(3));
        assertEquals(3, fibonacci.fibMemo(4));
        assertEquals(5, fibonacci.fibMemo(5));
        // Add more test cases as needed...
    }

    @Test
    void testFibBotUp() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.fibBotUp(0));
        assertEquals(1, fibonacci.fibBotUp(1));
        assertEquals(1, fibonacci.fibBotUp(2));
        assertEquals(2, fibonacci.fibBotUp(3));
        assertEquals(3, fibonacci.fibBotUp(4));
        assertEquals(5, fibonacci.fibBotUp(5));
        // Add more test cases as needed...
    }

    @Test
    void testFibOptimized() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.fibOptimized(0));
        assertEquals(1, fibonacci.fibOptimized(1));
        assertEquals(1, fibonacci.fibOptimized(2));
        assertEquals(2, fibonacci.fibOptimized(3));
        assertEquals(3, fibonacci.fibOptimized(4));
        assertEquals(5, fibonacci.fibOptimized(5));
        // Add more test cases as needed...
    }

    @Test
    void testFibBinet() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.fibBinet(0));
        assertEquals(1, fibonacci.fibBinet(1));
        assertEquals(1, fibonacci.fibBinet(2));
        assertEquals(2, fibonacci.fibBinet(3));
        assertEquals(3, fibonacci.fibBinet(4));
        assertEquals(5, fibonacci.fibBinet(5));
        // Add more test cases as needed...
    }

    @Test
    void testIntegration() {
        Fibonacci fibonacci = new Fibonacci();
        int n = 5;

        int fibMemoResult = fibonacci.fibMemo(n);
        int fibBotUpResult = fibonacci.fibBotUp(n);
        int fibOptimizedResult = fibonacci.fibOptimized(n);
        int fibBinetResult = fibonacci.fibBinet(n);

        // Integration test assertions
        assertEquals(fibBotUpResult, fibOptimizedResult);
        assertEquals(fibBinetResult, fibMemoResult);

      
    }
}
