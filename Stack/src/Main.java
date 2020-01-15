public class Main {

    public static void main(String[] args) {


    }

    // Abstract data type
    // LIFO - Last in, first out
    // push - adds an item as the top item on the stack
    // pop - removes the top item on the stack
    // peek - gets the top item on the stack without popping it
    // Ideal backing data structure: linked list

    // O(1) for pop, push, peak with a linked list
    // Linked list is ideal overall

    // Implementations with an array:
    // If you use an array, then push is O(n) because the array may have to be resized
    // If you know the max items that will ever be  on the stack, an array can be a good choice
    // If memory is tight, an array might be a good choice
    

}
