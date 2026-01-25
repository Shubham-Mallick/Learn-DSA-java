// Creating Graph using Adjacency List

import java.util.*;

public class Graph {
    int vertices;
    List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Add edge to the graph (for undirected graph)
    public void addEdge(int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    // Add directed edge (for directed graph)
    public void addDirectedEdge(int u, int v) {
        adjacencyList.get(u).add(v);
    }

    // Display the graph
    public void displayGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // Depth First Search (DFS)
    public void dfs(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

    // Breadth First Search (BFS)
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startVertex);
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjacencyList.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Get adjacency list
    public List<List<Integer>> getAdjacencyList() {
        return adjacencyList;
    }

    // Get number of vertices
    public int getVertices() {
        return vertices;
    }
}
