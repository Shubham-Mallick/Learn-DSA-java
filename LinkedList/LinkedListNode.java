public class LinkedListNode {
    public static void main(String[] args) {
        System.out.println("This is Node class");
        Node node1 = new Node(10);
        Node node2 = new Node(20);

        // Linking nodes
        node1.next = node2;

        System.out.println("Node data: " + node1.data);
        System.out.println("Next node data: " + node1.next.data);

    }
}
