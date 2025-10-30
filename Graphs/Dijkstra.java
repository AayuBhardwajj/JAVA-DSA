package Graphs;
import java.util.*;

public class Dijkstra {

    static class Edge {
        int dest, weight;
        Edge(int d, int w) {
            dest = d;
            weight = w;
        }
    }

    static class Graph {
        int V;
        List<Edge>[] adj;

        Graph(int V) {
            this.V = V;
            adj = new ArrayList[V];
            for (int i = 0; i < V; i++)
                adj[i] = new ArrayList<>();
        }

        void addEdge(int src, int dest, int weight) {
            adj[src].add(new Edge(dest, weight));
            adj[dest].add(new Edge(src, weight)); // for undirected graph
        }

        void dijkstra(int src) {
            int[] dist = new int[V];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[src] = 0;

            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
            pq.add(new int[]{src, 0});

            while (!pq.isEmpty()) {
                int[] node = pq.poll();
                int u = node[0];
                int d = node[1];

                if (d > dist[u]) continue;

                for (Edge edge : adj[u]) {
                    int v = edge.dest;
                    int weight = edge.weight;

                    if (dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                        pq.add(new int[]{v, dist[v]});
                    }
                }
            }

            System.out.println("Vertex \t Distance from Source");
            for (int i = 0; i < V; i++)
                System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1, 9);
        g.addEdge(0, 2, 6);
        g.addEdge(0, 3, 5);
        g.addEdge(0, 4, 3);
        g.addEdge(2, 1, 2);
        g.addEdge(2, 3, 4);

        g.dijkstra(0);
    }
}
