package binarytrees;

public class BinaryTree {
    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node findLCA(Node root, int v1, int v2){
        if(root==null)
            return null;

        if(root.data == v1 || root.data == v2) // if root is the
            return root;



        return root;
    }
}
