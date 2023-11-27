package com.example.emantrana.DSA.Tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class KDimensionalTreeTest {

    @Test
    void testKDTreeInsertAndSearch1() {
        KDimensionalTree.KDtree kdTree = new KDimensionalTree().new KDtree();
        KDimensionalTree.Node root = null;

        int[] point1 = {2, 3};
        int[] point2 = {5, 4};
        int[] point3 = {9, 6};
        int[] point4 = {4, 7};

        root = kdTree.insert(root, point1);
        root = kdTree.insert(root, point2);
        root = kdTree.insert(root, point3);

        assertTrue(kdTree.search(root, point1));
        assertTrue(kdTree.search(root, point2));
        assertFalse(kdTree.search(root, point4));
    }

    @Test
    void testKDTreeInsertAndSearch2() {
        KDimensionalTree.KDtree kdTree = new KDimensionalTree().new KDtree();
        KDimensionalTree.Node root = null;

        int[] point1 = {2, 3};
        int[] point2 = {5, 4};
        int[] point3 = {9, 6};
        int[] point4 = {4, 7};
        int[] point5 = {1, 2};

        root = kdTree.insert(root, point1);
        root = kdTree.insert(root, point2);
        root = kdTree.insert(root, point3);

        assertTrue(kdTree.search(root, point1));
        assertTrue(kdTree.search(root, point2));
        assertFalse(kdTree.search(root, point4));


        root = kdTree.insert(root, point4);
        assertTrue(kdTree.search(root, point4));

        assertFalse(kdTree.search(root, point5));
    }

    @Test
    void testKDTreeIntegration3() {
        KDimensionalTree.KDtree kdTree = new KDimensionalTree().new KDtree();
        KDimensionalTree.Node root = null;

        int[] point1 = {2, 3};
        int[] point2 = {5, 4};
        int[] point3 = {9, 6};
        int[] point4 = {4, 7};


        root = kdTree.insert(root, point1);
        root = kdTree.insert(root, point2);
        root = kdTree.insert(root, point3);

        assertTrue(kdTree.search(root, point1));
        assertTrue(kdTree.search(root, point2));
        assertFalse(kdTree.search(root, point4));


        root = kdTree.insert(root, point4);
        assertTrue(kdTree.search(root, point4));

        int[] point5 = {1, 2};
        assertFalse(kdTree.search(root, point5));
    }

    @Test
    void testKDTreeIntegration4() {
        KDimensionalTree.KDtree kdTree = new KDimensionalTree().new KDtree();
        KDimensionalTree.Node root = null;

        int[] point1 = {2, 3};
        int[] point2 = {5, 4};
        int[] point3 = {9, 6};
        int[] point4 = {4, 7};
        int[] point5 = {1, 2};
        int[] point6 = {7, 8};


        root = kdTree.insert(root, point1);
        root = kdTree.insert(root, point2);
        root = kdTree.insert(root, point3);

        assertTrue(kdTree.search(root, point1));
        assertTrue(kdTree.search(root, point2));
        assertFalse(kdTree.search(root, point4));


        root = kdTree.insert(root, point4);
        assertTrue(kdTree.search(root, point4));

        assertFalse(kdTree.search(root, point5));


        root = kdTree.insert(root, point5);
        root = kdTree.insert(root, point6);
        assertTrue(kdTree.search(root, point6));
        assertFalse(kdTree.search(root, new int[]{10, 12}));
    }

}
