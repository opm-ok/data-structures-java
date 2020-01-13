public class Main {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.addToTail(10);
        singlyLinkedList.addToTail(9);
        singlyLinkedList.addToTail(3);
        singlyLinkedList.addToTail(20);
        singlyLinkedList.addToTail(25);
        singlyLinkedList.addToTail(30);
        singlyLinkedList.addToTail(44);
        singlyLinkedList.addToHead(99);

        singlyLinkedList.printList();
        System.out.println("Singly Linked List contains: "
                + singlyLinkedList.getSize() + " elements");


    }
}
