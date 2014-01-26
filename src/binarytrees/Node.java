package binarytrees;

public class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node bstNode = (Node) o;

        return bstNode.data == data;
    }

    @Override
    public int hashCode() {
        return data * 31;
    }
}
