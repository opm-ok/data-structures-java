public class SinglyLinkedList {

    private Node head;
    private int size; // Track items added to the List

    // returns the number of elements added into the Linked List
    public int getSize() {
        return this.size;
    }

    // Insert data at the end of the list
    public void add(int data){
        Node newNode = new Node(data);

        // Adding to an empty list
        if (head == null){
            head = newNode;
            this.size++;

            // Traverse to the of end of list and add new node
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
            this.size++;
        }
    }

    // Insert data at the specified index
    public void add(int index, int data) {

        Node newNode = new Node(data);

        // Insert item at the front of the array
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
            this.size++;

        // New Node is added between the previous Node and the Node at the specified index
        } else {
            Node previousNode = query(index - 1); // Retrieve the previous Node before the selected index

            if (previousNode != null){
                newNode.setNext(previousNode.getNext()); // New Node will refer to the previous Node's next reference
                previousNode.setNext(newNode); // the previous Node will refer to the new Node
            }
        }
    }

    // Remove Node at the specified index
    public void remove(int index){

        // Remove item at the front of the array
        if (index == 0) {
            head = head.getNext();
            this.size--;

            // Node is removed at the specified index
        } else {
            Node previousNode = query(index - 1); // Retrieve Node prior to the Node at the specified index
            if (previousNode != null){
                Node nodeAtIndex = previousNode.getNext(); // Retrieve Node at the specified index
                if (nodeAtIndex != null){
                    previousNode.setNext(nodeAtIndex.getNext());
                }
            }
        }
    }

    // Returns T/F if the list is empty
    public boolean isEmpty(){
        return head == null;
    }

    // Traverse the LinkedList and print each value
    public void printList(){
        Node currentNode = head;

        System.out.print("Head -> ");
        while (currentNode.getNext() != null){
            System.out.print(currentNode.getData());
            currentNode = currentNode.getNext();
            System.out.print(" -> ");
        }
        System.out.print(currentNode.getData());
    }

    // Returns Node at specified index
    private Node query(int index){

        // Index out of bounds
        if (index < 0 || index >= this.size){
            System.out.println("Index out of bounds.");
            return null;
        }

        // Returns head node
        if (index == 0){
            return head;
        }

        // Traverses through the linkedList - returns Node at specified index
        else {
            int nodeIndex = 0;
            Node currentNode = head;

            // Traverse the LinkedList
            while (nodeIndex != index){
                currentNode = currentNode.getNext();
                nodeIndex++;
            }
            return currentNode;
        }
    }
}
