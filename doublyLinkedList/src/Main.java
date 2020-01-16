public class Main {

    public static void main(String[] args) {

        DoublyLinkedList linkedList = new DoublyLinkedList();

        // Adding
        linkedList.addToHead(10); // add to head
        linkedList.addToHead(8); // add to head
        linkedList.addAtIndex(2, 12); // add using index
        linkedList.addToTail(33); // Add to tail
        linkedList.addAtIndex(2, 44); // add between nodes
        linkedList.addToTail(15); // add to tail

        // Print
        linkedList.printList();
        System.out.println();

        // Removing
        linkedList.remove(0);
        linkedList.remove(2);

        // Print
        linkedList.printList();
        linkedList.printListReverse();

    }
}
