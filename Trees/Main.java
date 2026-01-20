public class Main {

    public static void main(String[] args) {
        // Creating Root Node
        Node root = new Node(1);

        // Creating left(2) and right(3) root
        Node left = new Node(2);
        Node right = new Node(3);

        // Setting root of the binary tree
        BinaryTree binarytree = new BinaryTree(root);
    
        // Implement left and right of binarytree
        binarytree.root.left = left;
        binarytree.root.right = right;

        // Creating Node 4 and 5
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // Implement in binarytree
        binarytree.root.left.left = node4;
        binarytree.root.left.right = node5;

        // Creating Node 6 and implement in binary tree
        Node node6 = new Node(6);
        binarytree.root.right.right = node6;

        // Traversal Operation
        System.out.println("preoder :");
        binarytree.preOrder(root);
        System.out.println();
        System.out.println("inoder :");
        binarytree.inOrder(root);
        System.out.println();
        System.out.println("postorder :");
        binarytree.postOrder(root);


    }
}