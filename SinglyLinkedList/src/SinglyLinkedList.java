public class SinglyLinkedList {

    private Node head;
    private int size;

    // returns the number of elements added into the Linked List
    public int getSize() {
        return size;
    }

    // Insert data at the end of the list
    public void addToTail(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            size++;

        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
            size++;
        }
    }

    // Insert data at the specified index
    public void addToHead(int data){
        Node newNode = new Node(data);

        // Insert item at the front of the array
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public boolean isEmpty(){
        return head == null;
    }

    // Traverse the LinkedList and print each value
    public void printList(){
        Node currentNode = head;

        while (currentNode.getNext() != null){
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
        System.out.println(currentNode.getData());
    }

}
