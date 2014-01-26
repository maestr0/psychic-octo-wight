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

    public void displayAll() {
        if (!isEmpty()) {
            Item i = first;
            while (i != null) {
                i.display();
                i = i.next;
            }
        } else {
            System.out.println("List empty");
        }
    }

    public boolean contains(String match) {
        Item i = first;
        while (i != null) {
            if (match != null && match.equals(i.data))
                return true;
            i = i.next;
        }
        return false;
    }

    public boolean remove(String match) {
        if (isEmpty())
            return false;

        Item i = first;
        Item previousItem = null;
        while (i != null) {
            if (match != null && match.equals(i.data)) {
                if (previousItem != null) {
                    previousItem.next = i.next;

                } else {
                    first = i.next;
                }
                return true;
            }

            previousItem = i;
            i = i.next;
        }

        return false;
    }

    public void addNode(String data){
        Item node = new Item(data);
        node.next = this.first;
        this.first = node;
    }
}
