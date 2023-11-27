package com.example.emantrana.DSA.Tree;

public class FloorCeil {


    class Node {

        int data;
        Node left, right;

        Node(int d)
        {
            data = d;
            left = right = null;
        }
    }

    class BinaryTree {

        Node root;

        int Ceil(Node node, int input)
        {

            if (node == null) {
                return -1;
            }

            if (node.data == input) {
                return node.data;
            }

            if (node.data < input) {
                return Ceil(node.right, input);
            }

            int ceil = Ceil(node.left, input);

            return (ceil >= input) ? ceil : node.data;
        }


    }




}
