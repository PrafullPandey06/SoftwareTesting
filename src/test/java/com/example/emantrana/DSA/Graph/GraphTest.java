package com.example.emantrana.DSA.Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GraphTest {
    @Test
    void testAddVertex() {
        Graph.AdjacencyListGraph<String> graph = new Graph().new AdjacencyListGraph<>();
        assertTrue(graph.addVertex("A"));
        assertTrue(graph.addVertex("B"));
        assertFalse(graph.addVertex("A"));
    }

    @Test
    void testAddEdge() {
        Graph.AdjacencyListGraph<Integer> graph = new Graph().new AdjacencyListGraph<>();
        assertTrue(graph.addEdge(1, 2));
        assertTrue(graph.addEdge(2, 3));
        assertFalse(graph.addEdge(1, 2));
        assertTrue(graph.addEdge(1, 3));

    }

    @Test
    void testRemoveEdge() {
        Graph.AdjacencyListGraph<Character> graph = new Graph().new AdjacencyListGraph<>();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addEdge('A', 'B');
        assertTrue(graph.removeEdge('A', 'B'));
        assertFalse(graph.removeEdge('A', 'B'));
    }

    @Test
    void testRemoveVertex() {
        Graph.AdjacencyListGraph<String> graph = new Graph().new AdjacencyListGraph<>();
        graph.addVertex("A");
        graph.addVertex("B");
        assertTrue(graph.removeVertex("A"));
        assertFalse(graph.removeVertex("A"));
    }





    @Test
    void testAddAndRemoveEdge() {
        Graph.AdjacencyListGraph<String> graph = new Graph().new AdjacencyListGraph<>();
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        assertTrue(graph.removeEdge("A", "B"));
        assertFalse(graph.removeEdge("A", "B")); // Edge doesn't exist
        assertTrue(graph.addEdge("C", "D"));
    }

    @Test
    void testAddAndRemoveVertex() {
        Graph.AdjacencyListGraph<Integer> graph = new Graph().new AdjacencyListGraph<>();
        graph.addVertex(1);
        graph.addVertex(2);
        assertTrue(graph.addEdge(1, 2));
        assertTrue(graph.removeVertex(1));
        assertFalse(graph.removeEdge(1, 2)); // Edge doesn't exist after removing vertex
        assertFalse(graph.removeVertex(1)); // Vertex doesn't exist
    }
}
