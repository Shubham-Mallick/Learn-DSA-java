public class Main {

    public static void main(String[] args) {
        // Creating an undirected graph with 5 vertices
        UndirectedGraphOperation graph = new UndirectedGraphOperation(5);

        // Adding undirected edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Display the undirected graph
        System.out.println("Undirected Graph Representation using Adjacency List:");
        graph.displayGraph();

        // Check if graph is connected
        System.out.println("\nIs graph connected? " + graph.isConnected());

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
