import java.util.*;

public class MakingNode {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node node1 = new Node(55);

        System.out.println(node1.data);  // 55
        System.out.println(node1.next);  // null

        Node node2 = new Node (65);
        node1.next = node2;
        System.out.println(node1.next.data);
    }
}
