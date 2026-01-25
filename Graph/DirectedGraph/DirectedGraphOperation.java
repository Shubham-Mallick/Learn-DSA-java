// Directed Graph Implementation
import java.util.*;

public class DirectedGraphOperation {
    int vertices;
    List<List<Integer>> adjacencyList;

    public DirectedGraphOperation(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Add directed edge
    public void addEdge(int u, int v) {
        adjacencyList.get(u).add(v);
    }

    // Display directed graph
    public void displayGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // DFS for directed graph
    public void dfs(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

    // BFS for directed graph
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
}
