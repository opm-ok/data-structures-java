import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class CircularQueue {

    private SuperHero[] queue;
    private int front; // Always contains the earliest element added in the queue
    private int back; // Always reference the next empty index

    // size = 5 and queue.length = 5

    // 0 data  - front
    // 1 data
    // 2 data
    // 3 data
    // 4       - back

    // add
    // 1 - resize the array if the array is full (front = 0 and back == length -1)
    //
    public void add(SuperHero superHero){

        if (size() == queue.length - 1){
            // double the array
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

        return removedSuperHero;
    }

    public SuperHero peek(){
        if (size() == 0){
            return null;
        }
        return queue[front];
    }

    public int size(){
        return back - front;
    }

    public void print(){
        System.out.println("Queue (Front to back): ");
        for (int i = front; i < back; i++) {
            System.out.println("\t" + queue[i]);
        }
    }
}
