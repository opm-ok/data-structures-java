public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private Node next;
    private Node previous;
    private int size;


    // Returns the number of elements in list
    public int getSize() {
        return this.size;
    }

    // Insert data at the front of the list
    public void addToHead(int data){
        Node newNode = new Node(data);
        newNode.setNext(head);

        // Insert in an empty list
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
    public void addAtIndex(int index, int data){
        Node newNode = new Node(data);

        if (index < 0 || index > this.size){
            System.out.println("Index out of bounds");
        }
        else {

            // Add to head of the list if the index is 0
            if (index == 0){
                addToHead(data);

            // Add to the tail of the list if the index is last valid index in the array
            } else if (index == this.size){
                addToTail(data);

            // Add between two nodes
            } else {
                Node previousNode = query(index - 1); // Previous node at the specified index
                Node currentNode = query(index); // Current node at the specified index

                // previousNode
                newNode.setNext(previousNode.getNext());
                newNode.setPrevious(previousNode);
                previousNode.setNext(newNode);

                // currentNode
                currentNode.setPrevious(newNode);

                // number of elements in the list increased
                this.size++;
            }
        }
    }

    // Remove node at the specified index
    public void remove(int index){

        // Input validation
        if (index < 0 || index >= this.size){
            System.out.println("Index out of bounds");

        // Remove from head
        } else if (index == 0){

            head = head.getNext();
            head.setPrevious(null);
            this.size--;

        // Remove from tail
        } else if (index == (this.size - 1)){

            tail = tail.getPrevious();
            tail.setNext(null);
            this.size--;

        // Remove node between two nodes
        } else {

            Node previousNode = query(index - 1);
            Node currentNode = query(index);

            previousNode.setNext(currentNode.getNext());
            currentNode.getNext().setPrevious(previousNode);
            this.size--;
        }
    }

    // Retrieve node at the specified index
    private Node query(int index){

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

    // Traverse and print from Head to Tail
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

    // Traverse and print from Tail to Head
    public void printListReverse(){
        Node currentNode = tail;

        if (currentNode != null){
            System.out.print("Tail -> ");
            while (currentNode.getPrevious() != null){
                System.out.print(currentNode.getData());
                System.out.print(" <=> ");
                currentNode = currentNode.getPrevious();
            }
            System.out.println(currentNode.getData() + " -> Null");
        } else {
            System.out.println("Empty List");
        }
    }
}
