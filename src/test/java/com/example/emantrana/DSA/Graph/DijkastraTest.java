package com.example.emantrana.DSA.Graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DijkastraTest {
    @Test
    void testDijkstraAlgorithm() {
        Dijkastra dij = new Dijkastra();
        int[][] graph = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        int[] expectedDistances = {0, 4, 12, 19, 21, 11, 9, 8, 14};
        dij.dijkstra(graph, 0);
        assertArrayEquals(expectedDistances, dij.getDistances());
    }

    @Test
    void testMinDist() {
        Dijkastra dijkastra = new Dijkastra();
        int[] dist = {0, 4, 12, 19, 21, 11, 9, 8, 14};
        Boolean[] set = {true, false, false, false, false, false, false, false, false};
        int result = dijkastra.minDist(dist, set);
        assertEquals(1, result);
    }



}
