public class Main {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add(10);
        singlyLinkedList.add(44);
        singlyLinkedList.add(99);
        singlyLinkedList.add(55);
        singlyLinkedList.remove(1);

        singlyLinkedList.printList();

    }
}
