package com.example.emantrana.DSA.Tree;

import java.util.Scanner;
public class TrieImp {

    public class TrieNode {
        TrieNode[] child;
        boolean end;

        public TrieNode() {
            child = new TrieNode[26];
            end = false;
        }

        public int getIndex(char ch) {
            return ch - 'a';
        }
    }


    private final TrieNode root;

    public TrieImp() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            int index = currentNode.getIndex(word.charAt(i));
            TrieNode node = currentNode.child[index];
            if (node == null) {
                node = new TrieNode();
                currentNode.child[index] = node;
            }
            currentNode = node;
        }
        currentNode.end = true;
    }

    public boolean search(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            int index = currentNode.getIndex(word.charAt(i));
            TrieNode node = currentNode.child[index];
            if (node == null) {
                return false;
            }
            currentNode = node;
        }
        return currentNode.end;
    }

    public boolean delete(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            int index = currentNode.getIndex(word.charAt(i));
            TrieNode node = currentNode.child[index];
            if (node == null) {
                return false;
            }
            currentNode = node;
        }
        if (currentNode.end) {
            currentNode.end = false;
            return true;
        }
        return false;
    }

    public static void sop(String print) {
        System.out.println(print);
    }

    public static boolean isValid(String word) {
        return word != null && word.matches("^[a-z]+$");
    }


}
