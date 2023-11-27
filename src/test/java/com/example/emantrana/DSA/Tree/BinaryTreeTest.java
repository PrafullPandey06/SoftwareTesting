package com.example.emantrana.DSA.Tree;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BinaryTreeTest {

    @Test
    void testInsertAndSearch() {
        BinaryTree tree = new BinaryTree();
        tree.put(10);
        tree.put(5);
        tree.put(15);

        assertTrue(tree.search(10));
        assertTrue(tree.search(5));
        assertTrue(tree.search(15));
        assertFalse(tree.search(20));
    }

    @Test
    void testRemoveLeafNode() {
        BinaryTree tree = new BinaryTree();
        tree.put(10);
        tree.put(5);
        tree.put(15);

        assertTrue(tree.remove(5));
        assertFalse(tree.search(5));
    }

    @Test
    void testRemoveNodeWithOneChild() {
        BinaryTree tree = new BinaryTree();
        tree.put(10);
        tree.put(5);
        tree.put(15);
        tree.put(12);

        assertTrue(tree.remove(15));
        assertFalse(tree.search(15));
    }

    @Test
    void testRemoveNodeWithTwoChildren() {
        BinaryTree tree = new BinaryTree();
        tree.put(10);
        tree.put(5);
        tree.put(15);
        tree.put(12);
        tree.put(17);

        assertTrue(tree.remove(15));
        assertFalse(tree.search(15));
    }

    @Test
    public void testbfs() {
        BinaryTree tree = new BinaryTree();
        tree.put(10);
        tree.put(5);
        tree.put(15);
        tree.put(3);
        tree.put(7);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        tree.bfs(tree.getRoot());
        assertEquals("10 15 5 7 3 ", outContent.toString());
    }
}

