public class Main {

    public static void main(String[] args) {
        // Creating a directed graph with 4 vertices
        DirectedGraphOperation graph = new DirectedGraphOperation(4);

        // Adding directed edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        // Display the directed graph
        System.out.println("Directed Graph Representation using Adjacency List:");
        graph.displayGraph();

        // Depth First Search
        System.out.println("\nDepth First Search (DFS) starting from vertex 2:");
        boolean[] visited = new boolean[4];
        graph.dfs(2, visited);

        // Breadth First Search
        System.out.println("\n\nBreadth First Search (BFS) starting from vertex 2:");
        graph.bfs(2);

        System.out.println("\n");
    }
}
