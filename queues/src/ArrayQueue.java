public class ArrayQueue {

    private SuperHero[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        this.queue = new SuperHero[capacity];
    }

    public void add(SuperHero superHero){

        // Queue is full, need to increase capacity
        if (back == queue.length){
            SuperHero[] newArray = new SuperHero[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        // add to queue and increment back
        queue[back++] = superHero;
    }

    public SuperHero remove(){

        // return null if the list is empty
        if (size() == 0){
            return null;
        }

        // remove the front item from the queue
        SuperHero removedSuperHero = queue[front];
        queue[front++] = null;

        // reset front and back when size = 0
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
        for (int i = front; i < back; i++) {
            System.out.println("\t" + queue[i]);
        }
    }
}
