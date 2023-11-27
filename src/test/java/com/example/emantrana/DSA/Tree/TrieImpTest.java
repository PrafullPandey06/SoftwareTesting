package com.example.emantrana.DSA.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrieImpTest {

    @Test
    void testInsertAndSearch() {
        TrieImp trie = new TrieImp();
        trie.insert("apple");
        trie.insert("app");

        assertTrue(trie.search("apple"));
        assertTrue(trie.search("app"));
        assertFalse(trie.search("ap"));
        assertFalse(trie.search("orange"));
    }

    @Test
    void testDelete() {
        TrieImp trie = new TrieImp();
        trie.insert("apple");
        trie.insert("app");

        assertTrue(trie.delete("app"));
        assertFalse(trie.search("app"));
        assertTrue(trie.search("apple"));
        assertFalse(trie.delete("orange"));
    }

    @Test
    void testIsValid() {
        assertTrue(TrieImp.isValid("abc"));
        assertTrue(TrieImp.isValid("xyz"));
        assertFalse(TrieImp.isValid("123"));
        assertFalse(TrieImp.isValid("Aa"));
        assertFalse(TrieImp.isValid("abc@"));
    }

    @Test
    void testIsValidEdgeCases() {
        assertFalse(TrieImp.isValid(""));
        assertFalse(TrieImp.isValid(null));
    }


    @Test
    void testInsertSearchAndDelete() {
        TrieImp trie = new TrieImp();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("orange");

        assertTrue(trie.search("apple"));
        assertTrue(trie.search("app"));
        assertTrue(trie.search("orange"));

        assertTrue(trie.delete("apple"));
        assertFalse(trie.search("apple"));
        assertTrue(trie.search("app"));
        assertTrue(trie.search("orange"));
    }

    @Test
    void testInsertAndIsValid() {
        TrieImp trie = new TrieImp();
        trie.insert("hello");
        trie.insert("world");

        assertTrue(TrieImp.isValid("hello"));
        assertTrue(TrieImp.isValid("world"));
        assertFalse(TrieImp.isValid("hello123"));
        assertFalse(TrieImp.isValid("WORLD"));
    }

    @Test
    void testIsValidAndSearch() {
        TrieImp trie = new TrieImp();
        trie.insert("test");
        trie.insert("example");

        assertTrue(TrieImp.isValid("test"));
        assertFalse(TrieImp.isValid("test!"));
        assertTrue(trie.search("test"));
    }

}
