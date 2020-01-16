import java.util.Arrays;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity){
        if (capacity > 0){
            this.stack = new Employee[capacity];
            this.top = 0;
        }
    }

    // Push - adds to the top of the stack
    public void push(Employee employee){
        if (top == stack.length){
            System.out.println("Full stack.");
            // Increase the size of the array
        }
        stack[top++] = employee;
        System.out.println("Pushed to stack: " + employee.getFirstName());
    }

    // Pop - remove from top of stack and returns object
    public Employee pop(){
        if (isEmpty()){
            System.out.println("Empty stack.");
            return null;
        }

        --top; // top shifts to the previous index that contains a value
        Employee removedEmployee = stack[top]; // retrieves value before removing
        stack[top] = null;
        return removedEmployee;
    }

    // Peak - returns object from the top of the stack and does not remove
    public Employee peak(){
        if (isEmpty()){
            System.out.println("Empty stack");
            return null;
        }
        return stack[top - 1];
    }

    // Size - returns the number of items in the ArrayStack
    public int getSize(){
        return this.top;
    }

    // isEmpty - returns T/F
    public boolean isEmpty(){
        return this.top == 0;




    }
}
