package com.example.emantrana.DSA.DP;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class LISTest {

    @Test
    void testLIS_EmptyArray() {
        LIS lis = new LIS();
        int[] array = {};
        assertEquals(0, lis.LIS(array));
    }

    @Test
    void testLIS_SingleElementArray() {
        LIS lis = new LIS();
        int[] array = { 5 };
        assertEquals(1, lis.LIS(array));
    }

    @Test
    void testLIS_SortedArray() {
        LIS lis = new LIS();
        int[] array = { 1, 2, 3, 4, 5 };
        assertEquals(5, lis.LIS(array));
    }

    @Test
    void testLIS_ReverseSortedArray() {
        LIS lis = new LIS();
        int[] array = { 5, 4, 3, 2, 1 };
        assertEquals(1, lis.LIS(array));
    }
    @Test
    void testBinarySearchBetween_KeyBeforeAll() {
        int[] array = { 10, 20, 30, 40, 50 };
        int end = 4;
        int key = 5;
        LIS lis = new LIS();
        int result = lis.binarySearchBetween(array, end, key);
        assertEquals(0, result);
    }

    @Test
    void testBinarySearchBetween_KeyAfterAll() {
        int[] array = { 10, 20, 30, 40, 50 };
        int end = 4;
        int key = 60;
        LIS lis = new LIS();
        int result = lis.binarySearchBetween(array, end, key);
        assertEquals(5, result);
    }

    @Test
    void testBinarySearchBetween_KeyAtBeginning() {
        int[] array = { 10, 20, 30, 40, 50 };
        int end = 4;
        int key = 10;
        LIS lis = new LIS();
        int result = lis.binarySearchBetween(array, end, key);
        assertEquals(0, result);
    }

    @Test
    void testBinarySearchBetween_KeyAtEnd() {
        int[] array = { 10, 20, 30, 40, 50 };
        int end = 4;
        int key = 50;
        LIS lis = new LIS();
        int result = lis.binarySearchBetween(array, end, key);
        assertEquals(4, result);
    }

    @Test
    void testBinarySearchBetween_KeyInMiddle() {
        int[] array = { 10, 20, 30, 40, 50 };
        int end = 4;
        int key = 30;
        LIS lis = new LIS();
        int result =lis.binarySearchBetween(array, end, key);
        assertEquals(2, result);
    }

    @Test
    void testBinarySearchBetween_KeyNotPresent() {
        int[] array = { 10, 20, 30, 40, 50 };
        int end = 4;
        int key = 35;
        LIS lis = new LIS();
        int result = lis.binarySearchBetween(array, end, key);
        assertEquals(3, result);
    }
    @Test
    void testFindLISLen_UsingLIS() {
        LIS lis = new LIS();
        int[] array = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        assertEquals(lis.LIS(array), lis.findLISLen(array));
    }
    @Test
    void testFindLISLen_EmptyArray() {
        LIS lis = new LIS();
        int[] array = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> lis.findLISLen(array));
    }
    @Test
    void testFindLISLen_SingleElementArray() {
        LIS lis = new LIS();
        int[] array = { 5 };
        assertEquals(1, lis.findLISLen(array));
    }

    @Test
    void testFindLISLen_ReverseSortedArray() {
        LIS lis = new LIS();
        int[] array = { 5, 4, 3, 2, 1 };
        assertEquals(1, lis.findLISLen(array));
    }
}
