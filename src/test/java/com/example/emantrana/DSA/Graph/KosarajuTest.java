package com.example.emantrana.DSA.Graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class KosarajuTest {

    @Test
    public void testKosarajuWithSingleComponent() {

        int v = 3;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(0);
        Kosaraju kosaraju = new Kosaraju();

        // Act
        List<List<Integer>> sccsList = kosaraju.kosaraju(v, graph);

        // Assert
        assertEquals(1, sccsList.size());
        assertEquals(3, sccsList.get(0).size());
    }

    @Test
    public void testKosarajuWithDisconnectedComponents() {
        int v = 5;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(0);
        graph.get(3).add(4);
        Kosaraju kosaraju = new Kosaraju();


        List<List<Integer>> sccsList = kosaraju.kosaraju(v, graph);

        // Assert
        assertEquals(3, sccsList.size());
        assertEquals(1, sccsList.get(0).size());
        assertEquals(1, sccsList.get(1).size());
    }

    @Test
    public void testKosarajuWithEmptyGraph() {
        // Arrange
        int v = 0;
        List<List<Integer>> graph = new ArrayList<>();
        Kosaraju kosaraju = new Kosaraju();
        List<List<Integer>> sccsList = kosaraju.kosaraju(v, graph);
        assertTrue(sccsList.isEmpty());
    }

    @Test
    public void testKosarajuWithSingleNode() {

        int v = 1;
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(new ArrayList<>());
        Kosaraju kosaraju = new Kosaraju();

        List<List<Integer>> sccsList = kosaraju.kosaraju(v, graph);
        assertEquals(1, sccsList.size());
        assertEquals(1, sccsList.get(0).size());
    }
    @Test
    public void testKosarajuIntegration() {
        // Arrange
        int v = 5;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(0);
        graph.get(3).add(4);
        Kosaraju kosaraju = new Kosaraju();


        List<List<Integer>> sccsList = kosaraju.kosaraju(v, graph);
        assertEquals(3, sccsList.size());
        assertFalse(sccsList.contains(Arrays.asList(0, 1, 2)));
        assertFalse(sccsList.contains(Arrays.asList(3, 4)));
    }

    @Test
    public void testKosarajuIntegrationSingleComponent() {
        // Arrange
        int v = 5;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(3);
        graph.get(3).add(4);
        graph.get(4).add(0);
        Kosaraju kosaraju = new Kosaraju();


        List<List<Integer>> sccsList = kosaraju.kosaraju(v, graph);


        assertEquals(1, sccsList.size());

        assertTrue(sccsList.stream().anyMatch(component -> component.containsAll(Arrays.asList(0, 1, 2, 3, 4))));





    }

}

