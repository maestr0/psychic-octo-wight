package binarytrees;

public class BinaryTree {
    public Node root;

    public BinaryTree(int i) {
        this.root = new Node(i);
    }

    public Node findLCA(Node root, int v1, int v2) {
        if (root == null)
            return null;

        if (root.data == v1 || root.data == v2) // this is the LCA for this case as ROOT value equals to one of the V1-2 values
            return root;

        // check if ROOT.left or ROOT.right elements are the LCA
        Node left = findLCA(root.left, v1, v2);
        Node right = findLCA(root.right, v1, v2);

        if (left != null && right != null) {
            // v1 and v2 are on different branches so left and right elements' root is LCA
            return root;
        } else if (left != null) {
            // v1 and v2 are on the same branch on the left
            return left;
        } else {
            // v1 and v2 are on the same branch on the right
            return right;
        }
    }

    public void add(int i) {

    }
}
