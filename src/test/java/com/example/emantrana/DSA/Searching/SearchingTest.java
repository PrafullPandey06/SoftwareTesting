package com.example.emantrana.DSA.Searching;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchingTest {

    @Test
    void testLinearSearch() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int result = Searching.linearSearch(array, target);
        assertEquals(2, result);
    }

    @Test
    void testBinarySearch() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 4;
        int result = Searching.binarySearch(array, target);
        assertEquals(3, result);
    }

    @Test
    void testTernarySearch() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 1;
        int result = Searching.ternarySearch(array, target);
        assertEquals(0, result);
    }

    @Test
    void testLinearSearchElementNotPresent() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6; // Element not present
        int result = Searching.linearSearch(array, target);
        assertEquals(-1, result);
    }

    @Test
    void testBinarySearchElementNotPresent() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6; // Element not present
        int result = Searching.binarySearch(array, target);
        assertEquals(-1, result);
    }

    @Test
    void testTernarySearchElementNotPresent() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        int result = Searching.ternarySearch(array, target);
        assertEquals(-1, result);
    }

    @Test
    void testInterpolationSearchElementNotPresent() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        int result = Searching.interpolationSearch(array, target);
        assertEquals(-1, result);
    }

    @Test
    void testInterpolationSearch() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 5;
        int result = Searching.interpolationSearch(array, target);
        assertEquals(4, result);
    }


    @Test
    void testBinarySearchAndInterpolationSearch() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 2;

        int binarySearchResult = Searching.binarySearch(array, target);
        int interpolationSearchResult = Searching.interpolationSearch(array, target);

        assertEquals(1, binarySearchResult);
        assertEquals(1, interpolationSearchResult);
        assertEquals(binarySearchResult, interpolationSearchResult);
    }

    @Test
    void testLinearSearchAndTernarySearch() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;

        int linearSearchResult = Searching.linearSearch(array, target);
        int ternarySearchResult = Searching.ternarySearch(array, target);

        assertEquals(2, linearSearchResult);
        assertEquals(2, ternarySearchResult);
        assertEquals(linearSearchResult, ternarySearchResult);
    }
}
