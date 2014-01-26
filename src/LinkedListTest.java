import linkedlist.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void addNewElement(){
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.isEmpty());

        linkedList.add("First");
        assertFalse(linkedList.isEmpty());
        linkedList.add("Second");
        assertFalse(linkedList.isEmpty());
        linkedList.add("Third");
        assertFalse(linkedList.isEmpty());

        linkedList.displayAll();

        assertTrue(linkedList.contains("Second"));

        linkedList.remove("Second");
        assertFalse(linkedList.isEmpty());
        linkedList.displayAll();

        assertFalse(linkedList.contains("Second"));
        linkedList.removeFirst();
        linkedList.removeFirst();

        assertTrue(linkedList.isEmpty());

    }
}
