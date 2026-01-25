// Creating node for graph
public class Node {
    int data;
    int vertex;

    public Node(int vertex) {
        this.vertex = vertex;
        this.data = vertex;
    }

    public Node(int data, int vertex) {
        this.data = data;
        this.vertex = vertex;
    }
}
