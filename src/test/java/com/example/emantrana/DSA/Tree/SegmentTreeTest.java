package com.example.emantrana.DSA.Tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
public class SegmentTreeTest {

    @Test
    void testSegmentTreeConstructionAndGetSum() {
        int[] arr = {1, 2, 3, 4, 5};
        SegmentTree segmentTree = new SegmentTree(arr.length, arr);

        assertEquals(15, segmentTree.getSum(0, 4));

        arr[2] = 10;
        segmentTree.update(2, 10);
        assertEquals(14, segmentTree.getSum(1, 4));
    }

    @Test
    void testSegmentTreeUpdate() {
        int[] arr = {1, 2, 3, 4, 5};
        SegmentTree segmentTree = new SegmentTree(arr.length, arr);

        segmentTree.update(2, 10);
        assertEquals(21, segmentTree.getSum(1, 4));

        segmentTree.update(0, 7);
        assertEquals(28, segmentTree.getSum(0, 4));
    }

    @Test
    void testSegmentTreeInvalidInput() {
        int[] arr = {1, 2, 3, 4, 5};
        SegmentTree segmentTree = new SegmentTree(arr.length, arr);

        assertEquals(0, segmentTree.getSum(3, 1));


        segmentTree.update(6, 10);
        assertEquals(15, segmentTree.getSum(0, 4));
    }



    @Test
    void testSegmentTreeIntegration1() {
        int[] arr = {1, 2, 3, 4, 5};
        SegmentTree segmentTree = new SegmentTree(arr.length, arr);


        segmentTree.update(2, 10);
        assertEquals(21, segmentTree.getSum(1, 4));

        segmentTree.update(0, 7);
        assertEquals(28, segmentTree.getSum(0, 4));


        arr[4] = 8;
        segmentTree.update(4, 8);
        assertEquals(28, segmentTree.getSum(0, 4));
    }

    @Test
    void testSegmentTreeIntegration2() {
        int[] arr = {3, 7, 2, 8, 6, 4, 1, 5};
        SegmentTree segmentTree = new SegmentTree(arr.length, arr);

        assertEquals(17, segmentTree.getSum(1, 3));
        assertEquals(20, segmentTree.getSum(2, 5));
        assertEquals(26, segmentTree.getSum(0, 4));

        segmentTree.update(4, 10);
        assertEquals(24, segmentTree.getSum(2, 5));

        segmentTree.update(1, 5);
        assertEquals(25, segmentTree.getSum(1, 4));
    }

}
