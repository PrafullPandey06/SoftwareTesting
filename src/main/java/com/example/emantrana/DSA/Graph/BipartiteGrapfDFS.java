package com.example.emantrana.DSA.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class BipartiteGrapfDFS {

    private static boolean bipartite(int V, ArrayList<ArrayList<Integer>> adj, int[] color, int node) {
        if (color[node] == -1) {
            color[node] = 1;
        }
        for (Integer it : adj.get(node)) {
            if (color[it] == -1) {
                color[it] = 1 - color[node];
                if (!bipartite(V, adj, color, it)) {
                    return false;
                }
            } else if (color[it] == color[node]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] color = new int[V + 1];
        Arrays.fill(color, -1);

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!bipartite(V, adj, color, i)) {
                    return false;
                }
            }
        }
        return true;
    }


}