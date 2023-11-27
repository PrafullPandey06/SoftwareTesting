package com.example.emantrana.DSA.Tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AVLTreeTest {

    @Test
    void testInsertionAndSearch() {
        AVLTree tree = new AVLTree();
        assertTrue(tree.insert(5));
        assertTrue(tree.insert(3));
        assertTrue(tree.insert(7));
        assertTrue(tree.insert(2));

        assertTrue(tree.search(7));
        assertFalse(tree.search(4));
    }

    @Test
    void testDeletion() {
        AVLTree tree = new AVLTree();
        assertTrue(tree.insert(5));
        assertTrue(tree.insert(3));
        assertTrue(tree.insert(7));
        assertTrue(tree.insert(2));

        assertTrue(tree.search(7));
        tree.delete(7);
        assertFalse(tree.search(7));
        assertTrue(tree.search(5));
    }

    @Test
    void testBalancing() {
        AVLTree tree = new AVLTree();
        assertTrue(tree.insert(5));
        assertTrue(tree.insert(3));
        assertTrue(tree.insert(7));
        assertTrue(tree.insert(2));

        assertEquals(-1, tree.getRootBalance());

        tree.delete(2);
        tree.delete(7);
        tree.insert(1);
        tree.insert(9);

        assertEquals(1, tree.getRootBalance());
    }

    @Test
    void testBalancing1() {
        AVLTree tree = new AVLTree();
        assertTrue(tree.insert(5));
        assertTrue(tree.insert(3));
        assertTrue(tree.insert(7));
        assertTrue(tree.insert(2));

        assertEquals(-1, tree.getRootBalance());

        tree.delete(2);
        tree.delete(7);
        tree.insert(1);
        tree.insert(9);

        assertEquals(1, tree.getRootBalance());
    }
    @Test
    void testEmptyTree() {
        AVLTree tree = new AVLTree();
        assertFalse(tree.search(5));
        tree.delete(5);
    }

    @Test
    void testComplexRotation1() {
        AVLTree tree = new AVLTree();
        assertTrue(tree.insert(5));
        assertTrue(tree.insert(3));
        assertTrue(tree.insert(7));
        assertTrue(tree.insert(2));
        assertTrue(tree.insert(4));
        assertTrue(tree.insert(6));
        assertTrue(tree.insert(8));


        tree.delete(2);
        tree.delete(8);
        tree.insert(1);
        tree.insert(9);


        assertEquals(0, tree.getRootBalance());
    }

    @Test
    void testInsertionDeletionAndBalancing() {
        AVLTree tree = new AVLTree();
        assertTrue(tree.insert(5));
        assertTrue(tree.insert(3));
        assertTrue(tree.insert(7));
        assertTrue(tree.insert(2));
        assertTrue(tree.insert(4));
        assertTrue(tree.insert(6));
        assertTrue(tree.insert(8));

        assertEquals(0, tree.getRootBalance());

        tree.delete(2);
        tree.delete(8);
        tree.insert(1);
        tree.insert(9);

        assertEquals(0, tree.getRootBalance());
    }

    @Test
    void testComplexRotation() {
        AVLTree tree = new AVLTree();
        assertTrue(tree.insert(5));
        assertTrue(tree.insert(3));
        assertTrue(tree.insert(7));
        assertTrue(tree.insert(2));
        assertTrue(tree.insert(4));
        assertTrue(tree.insert(6));
        assertTrue(tree.insert(8));

        assertEquals(0, tree.getRootBalance());


        tree.delete(2);
        tree.delete(8);
        tree.insert(1);
        tree.insert(9);


        assertEquals(0, tree.getRootBalance());
    }

    @Test
    void testSearchAndDeletion() {
        AVLTree tree = new AVLTree();
        assertTrue(tree.insert(5));
        assertTrue(tree.insert(3));
        assertTrue(tree.insert(7));
        assertTrue(tree.insert(2));
        assertTrue(tree.insert(4));
        assertTrue(tree.insert(6));
        assertTrue(tree.insert(8));

        assertTrue(tree.search(6));
        tree.delete(6);
        assertFalse(tree.search(6));
    }

}
