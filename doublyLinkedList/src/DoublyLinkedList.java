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
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        this.size++;
    }

    // Insert data at the end of the list
    public void addToTail(int data){
        Node newNode = new Node(data);

        // Insert in an empty list
        if (tail == null){
            head = newNode;
            tail = newNode;

        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
            }
        this.size++;
    }

    // Insert data at the specified index
    public void add(int index, int data){
        Node newNode = new Node(data);

        if (index < 0 || index >= this.size){
            System.out.println("Index out of bounds");
        }
        else {
            if (index == 0){
                addToHead(data);
            } else {
                Node previousNode = query(index -1);

            }
        }

    }

    // Retrieve node at the specified index
    public Node query(int index){

        if (index < 0 || index >= this.size){
            System.out.println("Index out of bound");
            return null;

        } else {
            Node currentNode = head;
            int traverseIndex = 0;
            while (traverseIndex != index){
                currentNode = currentNode.getNext();
                traverseIndex++;
            }
            return currentNode;
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
            System.out.println(currentNode.getData() + " -> Null");
        } else {
            System.out.println("Empty List");
        }
    }
}
