package com.example.emantrana.DSA.LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CircleLinkedListTest {
    @Test
    public void testAppend() {
        CircleLinkedList<Integer> list = new CircleLinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(3, list.getSize());
        assertEquals("[ 1 , 2 , 3 ]", list.toString());
    }

    @Test
    public void testRemove() {
        CircleLinkedList<String> list = new CircleLinkedList<>();
        list.append("apple");
        list.append("banana");
        list.append("cherry");
        assertEquals("banana", list.remove(1));
        assertEquals(2, list.getSize());
        assertEquals("[ apple , cherry ]", list.toString());
    }

    @Test
    public void testAppendNullElement() {
        CircleLinkedList<Integer> list = new CircleLinkedList<>();
        assertThrows(NullPointerException.class, () -> {
            list.append(null);
        });
    }

    @Test
    public void testAppendAndToString() {
        CircleLinkedList<Integer> list = new CircleLinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals("[ 1 , 2 , 3 ]", list.toString());
    }

    @Test
    public void testAppendAndRemove() {
        CircleLinkedList<String> list = new CircleLinkedList<>();
        list.append("apple");
        list.append("banana");
        list.append("cherry");
        list.remove(1);
        assertEquals("[ apple , cherry ]", list.toString());
    }

    @Test
    public void testAppendAndSize() {
        CircleLinkedList<Character> list = new CircleLinkedList<>();
        list.append('A');
        list.append('B');
        list.append('C');
        assertEquals(3, list.getSize());
    }
}
