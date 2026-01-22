public class BinarySearchOperation {
    
    // Insertion - Insert a new value into BST
    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        // If data equals root.data, duplicate insertion is ignored
        
        return root;
    }

    // Search - Search for a value in BST
    public boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        
        if (data == root.data) {
            return true;
        } else if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    // Find Minimum - Find the node with minimum value
    public Node findMin(Node root) {
        if (root == null) {
            return null;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Find Maximum - Find the node with maximum value
    public Node findMax(Node root) {
        if (root == null) {
            return null;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    // Deletion - Delete a node from BST
    public Node delete(Node root, int data) {
        if (root == null) {
            return null;
        }

        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            // Node found with data to delete
            
            // Case 1: Node with no children (Leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }
            
            // Case 2: Node with only one child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            
            // Case 3: Node with two children
            // Find the inorder successor (smallest node in right subtree)
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    // Inorder Traversal - Left, Root, Right
    public void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    // Preorder Traversal - Root, Left, Right
    public void preorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    // Postorder Traversal - Left, Right, Root
    public void postorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }
}
