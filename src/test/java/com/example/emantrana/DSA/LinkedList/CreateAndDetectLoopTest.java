package com.example.emantrana.DSA.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class CreateAndDetectLoopTest {

    @Test
    public void testDetectLoopWithLoop() {
        Node head = createLinkedListWithLoop();
        assertTrue(CreateAndDetectLoop.detectLoop(head));
    }

    @Test
    public void testDetectLoopWithoutLoop() {
        Node head = createLinkedListWithoutLoop();
        assertFalse(CreateAndDetectLoop.detectLoop(head));
    }

    @Test
    public void testDetectLoopWithEmptyList() {
        Node head = null;
        assertFalse(CreateAndDetectLoop.detectLoop(head));
    }

    @Test
    public void testCreateAndDetectLoop() {
        Node head = createLinkedListWithoutLoop();
        CreateAndDetectLoop.createLoop(head, 2);
        assertTrue(CreateAndDetectLoop.detectLoop(head));
    }

    @Test
    public void testCreateAndDetectLoopWithEmptyList() {
        Node head = null;
        CreateAndDetectLoop.createLoop(head, 1);
        assertFalse(CreateAndDetectLoop.detectLoop(head));
    }

    private Node createLinkedListWithoutLoop() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        return head;
    }

    private Node createLinkedListWithLoop() {
        Node head = createLinkedListWithoutLoop();
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        return head;
    }

}
