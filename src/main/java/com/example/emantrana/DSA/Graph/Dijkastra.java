package com.example.emantrana.DSA.Graph;

public class Dijkastra {

    int k = 9;
    private int[] dist;

    public Dijkastra() {
        dist = new int[k];
    }
    public int[] getDistances() {
        return dist;
    }

int minDist(int[] dist, Boolean[] Set) {
    int min = Integer.MAX_VALUE;
    int min_index = -1;

    for (int r = 0; r < k; r++) {
        if (!Set[r] && dist[r] < min) {
            min = dist[r];
            min_index = r;
        }
    }

    return min_index;
}



    void print(int[] dist) {
        System.out.println("Vertex \t\t Distance");
        for (int i = 0; i < k; i++) {
            System.out.println(i + " \t " + dist[i]);
        }
    }

    void dijkstra(int[][] graph, int src) {
        Boolean[] Set = new Boolean[k];

        for (int i = 0; i < k; i++) {
            dist[i] = Integer.MAX_VALUE;
            Set[i] = false;
        }

        dist[src] = 0;

        for (int c = 0; c < k - 1; c++) {
            int u = minDist(dist, Set);

            Set[u] = true;

            for (int v = 0; v < k; v++) {
                if (!Set[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
    }



}
