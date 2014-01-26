import binarytrees.BinaryTree;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void createBT() {
        BinaryTree bt = new BinaryTree(10);
        bt.add(5);
        bt.add(6);
        bt.add(7);
        bt.add(8);
        bt.add(1);
        bt.add(3);
        bt.add(2);
    }
}
