package com.example.emantrana.DSA.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Kosaraju {
    Stack<Integer> stack = new Stack<Integer>();

    // Store each component
    private List<Integer> scc = new ArrayList<>();

    private List<List<Integer>> sccsList = new ArrayList<>();


    public List<List<Integer>> kosaraju(int v, List<List<Integer>> list) {

        sortEdgesByLowestFinishTime(v, list);

        List<List<Integer>> transposeGraph = createTransposeMatrix(v, list);

        findStronglyConnectedComponents(v, transposeGraph);

        return sccsList;
    }

    private void sortEdgesByLowestFinishTime(int v, List<List<Integer>> list) {
        int[] vis = new int[v];
        for (int i = 0; i < v; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, list);
            }
        }
    }

    private List<List<Integer>> createTransposeMatrix(int v, List<List<Integer>> list) {
        var transposeGraph = new ArrayList<List<Integer>>(v);
        for (int i = 0; i < v; i++) {
            transposeGraph.add(new ArrayList<>());
        }
        for (int i = 0; i < v; i++) {
            for (Integer neigh : list.get(i)) {
                transposeGraph.get(neigh).add(i);
            }
        }
        return transposeGraph;
    }



    public void findStronglyConnectedComponents(int v, List<List<Integer>> transposeGraph) {
        int[] vis = new int[v];
        while (!stack.isEmpty()) {
            var node = stack.pop();
            if (vis[node] == 0) {
                // Create a new list for each strongly connected component
                scc = new ArrayList<>();
                dfs2(node, vis, transposeGraph);
                sccsList.add(scc);
            }
        }
    }

    private void dfs(int node, int[] vis, List<List<Integer>> list) {
        vis[node] = 1;
        for (Integer neighbour : list.get(node)) {
            if (vis[neighbour] == 0) dfs(neighbour, vis, list);
        }
        stack.push(node);
    }

    private void dfs2(int node, int[] vis, List<List<Integer>> list) {
        vis[node] = 1;
        for (Integer neighbour : list.get(node)) {
            if (vis[neighbour] == 0) dfs2(neighbour, vis, list);
        }
        scc.add(node);
    }
}
