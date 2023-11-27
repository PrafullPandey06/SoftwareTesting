package com.example.emantrana.DSA.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class KahnsAlgorithm{
    public static class AdjacencyList<E extends Comparable<E>> {

    Map<E, ArrayList<E>> adj;

    AdjacencyList() {
        adj = new LinkedHashMap<E, ArrayList<E>>();
    }

    void addEdge(E from, E to) {
        try {
            adj.get(from).add(to);
        } catch (Exception E) {
            adj.put(from, new ArrayList<E>());
            adj.get(from).add(to);
        }
        if (!adj.containsKey(to)) {
            adj.put(to, new ArrayList<E>());
        }
    }

    ArrayList<E> getAdjacents(E v) {
        return adj.get(v);
    }

    Set<E> getVertices() {
        return adj.keySet();
    }

    void printGraph() {
        for (E vertex : adj.keySet()) {
            System.out.print(vertex + " : ");
            for (E adjacent : adj.get(vertex)) {
                System.out.print(adjacent + " ");
            }
            System.out.println();
        }
    }
}

    public static class TopologicalSort<E extends Comparable<E>> {

    AdjacencyList<E> graph;
    Map<E, Integer> inDegree;

    TopologicalSort(AdjacencyList<E> graph) {
        this.graph = graph;
    }


    void calculateInDegree() {
        inDegree = new HashMap<>();
        for (E vertex : graph.getVertices()) {
            if (!inDegree.containsKey(vertex)) {
                inDegree.put(vertex, 0);
            }
            for (E adjacent : graph.getAdjacents(vertex)) {
                try {
                    inDegree.put(adjacent, inDegree.get(adjacent) + 1);
                } catch (Exception e) {
                    inDegree.put(adjacent, 1);
                }
            }
        }
    }


    ArrayList<E> topSortOrder() {
        calculateInDegree();
        Queue<E> q = new LinkedList<E>();

        for (E vertex : inDegree.keySet()) {
            if (inDegree.get(vertex) == 0) {
                q.add(vertex);
            }
        }

        ArrayList<E> answer = new ArrayList<>();

        while (!q.isEmpty()) {
            E current = q.poll();
            answer.add(current);
            for (E adjacent : graph.getAdjacents(current)) {
                inDegree.put(adjacent, inDegree.get(adjacent) - 1);
                if (inDegree.get(adjacent) == 0) {
                    q.add(adjacent);
                }
            }
        }

        return answer;
    }
}
}