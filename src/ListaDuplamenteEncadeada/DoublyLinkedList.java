package ListaDuplamenteEncadeada;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public void remove(int data) {
        if (head == null) return;

        Node current = head;

        if (current.data == data) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) return;

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }

    public String displayForward() {
        if (head == null) {
            return "A lista está vazia.";
        }
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        return sb.toString().trim();
    }

    public String displayBackward() {
        if (head == null) {
            return "A lista está vazia.";
        }
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.prev;
        }
        return sb.toString().trim();
    }
}
