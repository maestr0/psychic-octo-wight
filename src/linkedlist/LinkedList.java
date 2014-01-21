package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * User: maestr0
 * Date: 21/01/14
 * Time: 00:45
 * To change this template use File | Settings | File Templates.
 */
public class LinkedList {
    public Item first;


    public boolean isEmpty() {
        return first == null;
    }

    public void add(String newElement) {
        Item newItem = new Item(newElement);
        newItem.next = first;
        first = newItem;
    }

    public Item removeFirst() {
        Item el1 = first;
        if (!isEmpty()) {
            first = first.next;
        } else {
            System.out.println("List empty");
        }
        return el1;
    }
}
