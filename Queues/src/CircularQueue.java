import java.util.NoSuchElementException;

public class CircularQueue {

    private SuperHero[] queue;
    private int front; // Always contains the earliest element added in the queue
    private int back; // Always reference the next empty index

    public CircularQueue(int capacity){
        this.queue = new SuperHero[capacity];
    }

    public void add(SuperHero superHero){

        // 1 - resize the array if the array is full (size() == queue.length - 1)
        // 2 - Add and increment back (array is not full)
        // 3 - Move back to zero if array not full and back reach end of array

        if (size() == queue.length - 1){
            int numItems = size(); // used to assign back index for the new array

            SuperHero[] newArray = new SuperHero[queue.length * 2];

            // Copy from front to the end of the array
            System.arraycopy(queue, front, newArray, 0, queue.length - front);

            // Copy from 0 to back
            System.arraycopy(queue, 0, newArray, queue.length - front, back);

            queue = newArray;

            front = 0;
            back = numItems;
        }

        queue[back] = superHero;
        if (back < queue.length -1){
            back++;
        }
        else {
            back = 0;
        }
    }

    public SuperHero remove(){

        // if queue is empty
        if (size() == 0){
            throw new NoSuchElementException();
        }

        SuperHero removedSuperHero = queue[front];
        queue[front++] = null; // set removed value to null and then increment front index

        // Front = back, there should be no more elements in the queue, therefore we can reset the front and back indexes
        if (size() == 0){
            front = 0;
            back = 0;
        }
        // Wrap front to 0 when the front reaches the end of the queue
        else if (front == queue.length){
            front = 0;
        }
        return removedSuperHero;
    }

    public SuperHero peek(){
        if (size() == 0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size(){

        // queue hasn't wrapped. Back is greater than front
        if (front <= back){
            return back - front;
        }
        else {
            return back - front + queue.length;
        }
    }

    public void print(){
        System.out.println("Queue (Front to back): ");
        if (front <= back){
            for (int i = front; i < back; i++) {
                System.out.println("\t" + queue[i]);
            }
        }
        else {
            for (int i = front; i < queue.length; i++) {
                System.out.println("\t" + queue[i]);
            }

            for (int i = 0; i < back; i++) {
                System.out.println("\t" + queue[i]);
            }
        }
    }
}
