public class Node {
    public static void main(String[] args) {
        System.out.println("This is Node class");
        LinkedListNode.Node node1 = new LinkedListNode.Node(10);
        LinkedListNode.Node node2 = new LinkedListNode.Node(20);

        // Linking nodes
        node1.next = node2;

        System.out.println("Node data: " + node1.data);
        System.out.println("Next node data: " + node1.next.data);

    }
}
