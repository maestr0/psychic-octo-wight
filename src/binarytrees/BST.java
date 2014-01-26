package binarytrees;

public class BST {
    Node root;

    public BST() {
    }

    private static Node findLCA(Node root, int n1, int n2) {
        if (root == null)
            return null;

        // if n1 and n2 smaller than root, then LCA lies in left

        if (n1 < root.data && n2 < root.data) {
            return findLCA(root.left, n1, n2);
        }

        // if n1 and n2 larger than root, then LCA lies in right
        if (n1 > root.data && n2 > root.data) {
            return findLCA(root.right, n1, n2);
        }

        return root;
    }
}
