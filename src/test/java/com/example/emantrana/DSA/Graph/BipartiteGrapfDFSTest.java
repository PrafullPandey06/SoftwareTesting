package com.example.emantrana.DSA.Graph;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class BipartiteGrapfDFSTest {
    @Test
    public void testIsBipartiteWithEmptyGraph() {

        int V = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        boolean result = BipartiteGrapfDFS.isBipartite(V, adj);

        assertTrue(result, "Empty graph should be considered bipartite");
    }

    @Test
    public void testIsBipartiteWithBipartiteGraph() {

        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2)));
        adj.add(new ArrayList<>(Arrays.asList(1, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2)));

        boolean result = BipartiteGrapfDFS.isBipartite(V, adj);

        assertTrue(result, "Bipartite graph should be recognized as bipartite");
    }

    @Test
    public void testIsBipartiteWithNonBipartiteGraph() {

        int V = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 1)));

        boolean result = BipartiteGrapfDFS.isBipartite(V, adj);

        assertFalse(result, "Non-bipartite graph should not be recognized as bipartite");
    }

    @Test
    public void testIsBipartiteWithDisconnectedBipartiteGraphs() {

        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2)));
        adj.add(new ArrayList<>(Arrays.asList(1, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2)));
        adj.add(new ArrayList<>()); // Isolated vertex

        boolean result = BipartiteGrapfDFS.isBipartite(V, adj);

        assertTrue(result, "Disconnected bipartite graphs should be recognized as bipartite");
    }
}
