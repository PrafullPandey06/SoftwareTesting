package com.example.emantrana.DSA.Tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class FloorCeilTest {
    @Test
    void testBinaryTreeCeil() {
        FloorCeil.BinaryTree binaryTree = (new FloorCeil()).new BinaryTree();
        assertEquals(1, binaryTree.Ceil((new FloorCeil()).new Node(1), 1));
    }

    @Test
    void testBinaryTreeCeil2() {
        assertEquals(-1, ((new FloorCeil()).new BinaryTree()).Ceil(null, -1));
    }

    @Test
    void testBinaryTreeCeil3() {
        FloorCeil.BinaryTree binaryTree = (new FloorCeil()).new BinaryTree();
        assertEquals(-1, binaryTree.Ceil((new FloorCeil()).new Node(1), -1));
    }

    @Test
    void testBinaryTreeCeil4() {
        FloorCeil.BinaryTree binaryTree = (new FloorCeil()).new BinaryTree();
        assertEquals(-1, binaryTree.Ceil((new FloorCeil()).new Node(0), 1));
    }

    @Test
    void testBinaryTreeCeil5() {
        FloorCeil.BinaryTree binaryTree = (new FloorCeil()).new BinaryTree();
        assertEquals(1, binaryTree.Ceil((new FloorCeil()).new Node(1), 0));
    }


    @Test
    public void testCeil1() {
        FloorCeil floorCeil = new FloorCeil();
        FloorCeil.BinaryTree tree = floorCeil.new BinaryTree();

        tree.root = floorCeil.new Node(8);
        tree.root.left = floorCeil.new Node(4);
        tree.root.right = floorCeil.new Node(12);
        tree.root.left.left = floorCeil.new Node(2);
        tree.root.left.right = floorCeil.new Node(6);
        tree.root.right.left = floorCeil.new Node(10);
        tree.root.right.right = floorCeil.new Node(14);
        assertEquals(4, tree.Ceil(tree.root, 4)); // Ceil of 4 is 4
        assertEquals(6, tree.Ceil(tree.root, 5)); // Ceil of 5 is 6
        assertEquals(10, tree.Ceil(tree.root, 9)); // Ceil of 9 is 10
        assertEquals(14, tree.Ceil(tree.root, 14)); // Ceil of 14 is 14
        assertEquals(2, tree.Ceil(tree.root, 2)); // Ceil of 2 is 2
        assertEquals(8, tree.Ceil(tree.root, 8)); // Ceil of 8 is 8

    }

    @Test
    public void testCeil2() {
        FloorCeil floorCeil = new FloorCeil();
        FloorCeil.BinaryTree tree = floorCeil.new BinaryTree();
        tree.root = floorCeil.new Node(10);
        tree.root.left = floorCeil.new Node(5);
        tree.root.right = floorCeil.new Node(15);
        tree.root.left.left = floorCeil.new Node(3);
        tree.root.left.right = floorCeil.new Node(8);
        tree.root.right.left = floorCeil.new Node(12);
        tree.root.right.right = floorCeil.new Node(18);
        assertEquals(8, tree.Ceil(tree.root, 7)); // Ceil of 7 is 8
        assertEquals(18, tree.Ceil(tree.root, 16)); // Ceil of 16 is 18
        assertEquals(10, tree.Ceil(tree.root, 10)); // Ceil of 10 is 1
        assertEquals(3, tree.Ceil(tree.root, 2)); // Ceil of 2 is 3
        assertEquals(5, tree.Ceil(tree.root, 5)); // Ceil of 5 is 5
        assertEquals(15, tree.Ceil(tree.root, 14)); // Ceil of 14 is 15

    }
}

