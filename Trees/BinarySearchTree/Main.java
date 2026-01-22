import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchOperation bst = new BinarySearchOperation();
        Node root = null;
        int choice;

        while (true) {
            System.out.println("\n===== Binary Search Tree Operations =====");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Find Minimum");
            System.out.println("5. Find Maximum");
            System.out.println("6. Inorder Traversal");
            System.out.println("7. Preorder Traversal");
            System.out.println("8. Postorder Traversal");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value to insert: ");
                int insertValue = sc.nextInt();
                root = bst.insert(root, insertValue);
                System.out.println("Value inserted successfully!");
            } else if (choice == 2) {
                System.out.print("Enter value to delete: ");
                int deleteValue = sc.nextInt();
                root = bst.delete(root, deleteValue);
                System.out.println("Value deleted successfully!");
            } else if (choice == 3) {
                System.out.print("Enter value to search: ");
                int searchValue = sc.nextInt();
                if (bst.search(root, searchValue)) {
                    System.out.println("Value found in BST!");
                } else {
                    System.out.println("Value not found in BST!");
                }
            } else if (choice == 4) {
                if (root == null) {
                    System.out.println("BST is empty!");
                } else {
                    Node minNode = bst.findMin(root);
                    System.out.println("Minimum value: " + minNode.data);
                }
            } else if (choice == 5) {
                if (root == null) {
                    System.out.println("BST is empty!");
                } else {
                    Node maxNode = bst.findMax(root);
                    System.out.println("Maximum value: " + maxNode.data);
                }
            } else if (choice == 6) {
                if (root == null) {
                    System.out.println("BST is empty!");
                } else {
                    System.out.print("Inorder Traversal: ");
                    bst.inorderTraversal(root);
                    System.out.println();
                }
            } else if (choice == 7) {
                if (root == null) {
                    System.out.println("BST is empty!");
                } else {
                    System.out.print("Preorder Traversal: ");
                    bst.preorderTraversal(root);
                    System.out.println();
                }
            } else if (choice == 8) {
                if (root == null) {
                    System.out.println("BST is empty!");
                } else {
                    System.out.print("Postorder Traversal: ");
                    bst.postorderTraversal(root);
                    System.out.println();
                }
            } else if (choice == 9) {
                System.out.println("Exiting program. Thank you!");
                sc.close();
                return;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
