package ListaDuplamenteEncadeada;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {

    private DoublyLinkedList list;

    @BeforeEach
    public void setUp() {
        list = new DoublyLinkedList();
    }

    @Test
    public void testInsertAtEnd() {
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        assertEquals("10 20 30", list.displayForward());
    }

    @Test
    void insertAtEnd() {
    }

    @Test
    void displayForward() {
    }

    @Test
    void insertAtBeginning() {
    }

    @Test
    void remove() {
    }

    @Test
    void displayBackward() {
    }

    @Test
    void getI() {
    }

    @Test
    void setI() {
    }
}
