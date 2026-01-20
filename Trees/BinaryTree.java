// Creating Binary tree

public class BinaryTree {
    Node root;

    public BinaryTree(Node root){
        this.root = root;
    }

    public BinaryTree(){
        this.root=null;
    }

    // Traversal Operation 
    // preOrder Traversal (Root-->Left-->Right)
    public void preOrder(Node node){
        if (node==null) return;
        System.out.print(node.data+"\t");
        preOrder(node.left);
        preOrder(node.right);
    }

    // inOrder Traversal (Left-->Root-->Right)
    public void inOrder(Node node){
        if (node==null) return;
        inOrder(node.left);
        System.out.print(node.data+"\t");
        inOrder(node.right);
    }

    //postOrder Traversal(Left-->Right-->Node)
    public void postOrder(Node node){
        if (node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+"\t");
    }
}

