public class Main {

    public static void main(String[] args) {

        DoublyLinkedList linkedList = new DoublyLinkedList();

        linkedList.addToHead(10);
        linkedList.addToHead(8);
        linkedList.addToHead(12);
        linkedList.addToHead(7);
        linkedList.addToTail(-10);
//        linkedList.addToTail(-55);

        linkedList.printList();

        System.out.println("======");
        linkedList.query(0);
        linkedList.query(1);
        linkedList.query(-1);
        linkedList.query(5);




    }
}
