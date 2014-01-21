package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * User: maestr0
 * Date: 21/01/14
 * Time: 00:46
 * To change this template use File | Settings | File Templates.
 */
public class Item {
    public Item next;
    public String data;

    public Item(String data) {
        this.data = data;
    }

    public void display(){
        System.out.println(data);
    }
}
