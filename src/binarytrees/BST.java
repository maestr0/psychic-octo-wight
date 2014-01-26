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

    public static Node findLCAIterative(Node root, int v1, int v2) {

        if (root == null)
            return null;

        while (root != null) {

            if (v1 < root.data && v2 < root.data) {
                root = root.left;
            } else if (v1 > root.data && v2 > root.data) {
                root = root.left;
            } else {
                break;
            }

        }
        return root;

    }

    public boolean isBST() {
        return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTHelper(Node root, int minValue, int maxValue) {
        if (root == null) return true;
        if (minValue < root.data && maxValue >= root.data) {
            return isBSTHelper(root.left, minValue, root.data) && isBSTHelper(root.right, root.data, maxValue);
        } else {
            return false;
        }
    }
}
