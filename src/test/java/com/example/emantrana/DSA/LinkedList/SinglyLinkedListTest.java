package com.example.emantrana.DSA.LinkedList;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void testInsertAndSize() {
        SinglyLinkedList list = new SinglyLinkedList();
        assertEquals(0, list.size());

        list.insert(42);
        assertEquals(1, list.size());

        list.insert(13);
        list.insert(7);
        assertEquals(3, list.size());
    }

    @Test
    void testDelete() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);

        list.delete();
        assertEquals(2, list.size());
        assertEquals(2, list.getNth(1));
    }

    @Test
    void testSearch() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        assertTrue(list.search(20));
        assertFalse(list.search(15));
    }


    @Test
    void testReverseListIter() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);

        list.setHead(list.reverseListIter(list.getHead()));


        assertEquals("3->2->1", list.toString());
    }



    @Test
    void testDetectLoop() {
        SinglyLinkedList list = new SinglyLinkedList();
        assertFalse(list.detectLoop());

        // Create a loop
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.getHead().next.next.next = list.getHead();
        assertTrue(list.detectLoop());
    }

    @Test
    void testMiddle() {
        SinglyLinkedList list = new SinglyLinkedList();
        assertNull(list.middle());

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        assertEquals(2, list.middle().value);
    }


@Test
void testReverseListAndSize() {
    SinglyLinkedList list = new SinglyLinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);

    list.setHead(list.reverseListIter(list.getHead()));

    assertEquals(3, list.size());
    assertEquals("3->2->1", list.toString());
}

    @Test
    void testPrint() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        list.print();

        System.setOut(System.out);

        String expectedOutput = "1->2->3";
        assertTrue(outputStream.toString().contains(expectedOutput));
    }

    @Test
    void testDeleteDuplicatesAndCount() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(3);

        System.out.println("Original list: " + list.toString());

        list.deleteDuplicates();

        System.out.println("List after deleteDuplicates: " + list.toString());
        assertEquals(3, list.count());
        assertEquals(3, list.count());
    }

@Test
    void testSwapNodesAndSize() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.swapNodes(2, 3);
        assertEquals(4, list.size());
        assertEquals("1->3->2->4", list.toString());
    }
}
