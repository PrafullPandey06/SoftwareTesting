package com.example.emantrana.DSA.Graph;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class KahnsAlgorithmTest {

    @Test
    void testTopologicalSort() {
        KahnsAlgorithm.AdjacencyList<Integer> graph = new KahnsAlgorithm.AdjacencyList<>();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        KahnsAlgorithm.TopologicalSort<Integer> topologicalSort = new KahnsAlgorithm.TopologicalSort<>(graph);
        List<Integer> result = topologicalSort.topSortOrder();

        assertIterableEquals(Arrays.asList(1, 2, 3, 4), result);
    }

    @Test
    void testTopologicalSortWithCycle() {
        KahnsAlgorithm.AdjacencyList<Integer> graph = new KahnsAlgorithm.AdjacencyList<>();
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        KahnsAlgorithm.TopologicalSort<Integer> topologicalSort = new KahnsAlgorithm.TopologicalSort<>(graph);
        List<Integer> result = topologicalSort.topSortOrder();

        assertIterableEquals(Arrays.asList(), result);
    }

    @Test
    void testAddEdge() {
        KahnsAlgorithm.AdjacencyList<Integer> graph = new KahnsAlgorithm.AdjacencyList<>();
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);


        assertEquals(1, graph.getAdjacents(1).size());
        assertEquals(1, graph.getAdjacents(2).size());
        assertTrue(graph.getAdjacents(1).contains(2));
        assertTrue(graph.getAdjacents(2).contains(3));
    }

    @Test
    void testTopologicalSortOrder() {
        KahnsAlgorithm.AdjacencyList<Integer> graph = new KahnsAlgorithm.AdjacencyList<>();
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        KahnsAlgorithm.TopologicalSort<Integer> topologicalSort = new KahnsAlgorithm.TopologicalSort<>(graph);


        assertEquals(3, topologicalSort.topSortOrder().size());
        assertTrue(topologicalSort.topSortOrder().indexOf(1) < topologicalSort.topSortOrder().indexOf(2));
        assertTrue(topologicalSort.topSortOrder().indexOf(2) < topologicalSort.topSortOrder().indexOf(3));
    }

    // Integration Test 1
    @Test
    void testGraphWithTopologicalSort() {

        KahnsAlgorithm.AdjacencyList<Integer> graph = new KahnsAlgorithm.AdjacencyList<>();
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

       ;
        KahnsAlgorithm.TopologicalSort<Integer> topologicalSort = new KahnsAlgorithm.TopologicalSort<>(graph);
        List<Integer> result = topologicalSort.topSortOrder();

        assertIterableEquals(Arrays.asList(1, 2, 3, 4), result);
    }


    @Test
    void testGraphWithTopologicalSortAndCycle() {
        KahnsAlgorithm kahnsAlgorithm = new KahnsAlgorithm();


        KahnsAlgorithm.AdjacencyList<Integer> graph = new KahnsAlgorithm.AdjacencyList<>();
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);


        KahnsAlgorithm.TopologicalSort<Integer> topologicalSort = new KahnsAlgorithm.TopologicalSort<>(graph);
        List<Integer> result = topologicalSort.topSortOrder();

        assertIterableEquals(Arrays.asList(), result);
    }
}

