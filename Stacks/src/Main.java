import javax.swing.*;
import java.time.temporal.Temporal;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5); // Stack implementation with an Array


        Employee batman = new Employee("Bruce", "Wayne", 101);
        Employee superman = new Employee("Clark", "Kent", 55);
        Employee flash = new Employee("Barry", "Allen", 777);
        Employee wonderWoman = new Employee("Diana", "Prince", 99);
        Employee ironMan = new Employee("Tony", "Stark", 88);
        Employee hulk = new Employee("Bruce", "Banner", 1000);
        Employee blackWidow = new Employee("Natasha", "Romanoff", 453);
        Employee thor = new Employee("Thor", "Odison", 789);

        // Push
        stack.push(batman);
        stack.push(superman);
        stack.push(flash);
        stack.push(wonderWoman);
        stack.push(ironMan);
        stack.push(hulk);
        stack.push(blackWidow);
        stack.push(thor);
        System.out.println();

        // Pop
        stack.pop(); // thor removed
        stack.pop(); // blackWidow removed
        stack.pop(); // hulk removed
        System.out.println();

        // Peek
        stack.peek();

        System.out.println("\nStack is empty: " + stack.isEmpty());
        System.out.println("Size of stack: " + stack.getSize());

        System.out.println();
        System.out.println("Print all employees in the stack (Top to bottom):");
        stack.print();
    }
}

// Abstract data type
// LIFO - Last in, first out
// push - adds an item as the top item on the stack
// pop - removes the top item on the stack
// peek - gets the top item on the stack without popping it
// Ideal backing data structure: linked list

// O(1) for pop, push, peek with a linked list
// Linked list is ideal overall

// Implementations with an array:
// If you use an array, then push is O(n) because the array may have to be resized
// If you know the max items that will ever be  on the stack, an array can be a good choice
// If memory is tight, an array might be a good choice
