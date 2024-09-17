package ListaDuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Inserindo elementos na lista
        System.out.println("Inserindo elementos na lista:");
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        System.out.println("Lista após inserções (final): " + list.displayForward());

        // Inserindo um elemento no início
        System.out.println("Inserindo 5 no início da lista:");
        list.insertAtBeginning(5);
        System.out.println("Lista após inserção (início): " + list.displayForward());

        // Removendo um elemento
        System.out.println("Removendo 20 da lista:");
        list.remove(20);
        System.out.println("Lista após remoção: " + list.displayForward());

        // Exibindo a lista de trás para frente
        System.out.println("Exibindo a lista de trás para frente: " + list.displayBackward());
    }
}