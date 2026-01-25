public class Main {

    public static void main(String[] args) {
        // Creating a graph with 5 vertices
        Graph graph = new Graph(5);

        // Adding edges (undirected graph)
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Display the graph
        System.out.println("Graph Representation using Adjacency List:");
        graph.displayGraph();

        // Depth First Search
        System.out.println("\nDepth First Search (DFS) starting from vertex 0:");
        boolean[] visited = new boolean[5];
        graph.dfs(0, visited);

        // Breadth First Search
        System.out.println("\n\nBreadth First Search (BFS) starting from vertex 0:");
        graph.bfs(0);

        System.out.println("\n");
    }
}
