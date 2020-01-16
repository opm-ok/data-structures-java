import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top; // tracks the next available index for push method

    public ArrayStack(int capacity){
        if (capacity > 0){
            this.stack = new Employee[capacity];
            this.top = 0;
        }
    }

    // Push - adds to the top of the stack
    public void push(Employee employee){
        if (top == stack.length){

            // Resize the array on a full stack
            Employee[] newArray = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
        System.out.println("Pushed: " + employee.getFirstName() + " " + employee.getLastName());
    }

    // Pop - removes from the top of stack and returns object
    public Employee pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        top--; // top shifts to the previous index that contains a value
        Employee removedEmployee = stack[top]; // retrieves value before removing
        stack[top] = null;
        System.out.println("Popped: " + removedEmployee.getFirstName() + " " + removedEmployee.getLastName());
        return removedEmployee;
    }

    // Peak - returns object from the top of the stack but does not remove
    public Employee peak(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        Employee peakedEmployee = stack[top - 1];
        System.out.println("Peaked: " + peakedEmployee);
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

    // Print all items from top to bottom
    public void printEmployees(){
        for (int i = top - 1; i > 0 ; i--) {
            Employee employee = stack[i];
            System.out.println("\t" + employee);
        }
    }
}
