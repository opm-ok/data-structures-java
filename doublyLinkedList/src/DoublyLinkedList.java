public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private Node next;
    private Node previous;
    private int size;

    public int getSize() {
        return this.size;
    }

    // Insert data at the front of the list
    public void addToHead(int data){
        Node newNode = new Node(data);
        newNode.setNext(head);

        if (head == null){
            head = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
    }

    // Insert data at the end of the list
    public void addToTail(int data){
        Node newNode = new Node(data);

        // Insert in an empty list
        if (tail == null){
            head = newNode;
            this.size++;

        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
            this.size++;
            }

    }


    public void printList(){
        Node currentNode = head;

        if (currentNode != null){
            System.out.print("Head -> ");
            while (currentNode.getNext() != null){
                System.out.print(currentNode.getData());
                System.out.print(" <=> ");
                currentNode = currentNode.getNext();
            }
            System.out.print(currentNode.getData() + " -> Null");
        } else {
            System.out.println("Empty List");
        }
    }
}
