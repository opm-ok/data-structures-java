public class Main {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(5);

        SuperHero batman = new SuperHero("Bruce", "Wayne", 1000);
        SuperHero superman = new SuperHero("Clark", "Kent", 9000);
        SuperHero spiderman = new SuperHero("Peter", "Parker", 1250);
        SuperHero hulk = new SuperHero("Bruce", "Banner", 4500);
        SuperHero ironman = new SuperHero("Tony", "Stark", 2500);
        SuperHero shazam = new SuperHero("Billy", "Batson", 3000);

        queue.add(batman);
        queue.add(superman);
        queue.add(spiderman);
        queue.add(hulk);
        queue.add(ironman);
        queue.add(shazam);

        queue.remove();
        System.out.println("Size of Queue: " + queue.size());
        System.out.println("Peek: " + queue.peek());

        System.out.println("\nQueue printed front to back: ");
        queue.print();
    }
}

// Abstract data type
// FIFO
// Add (Enqueued) - adds an item to the end of the queue
// Remove (Dequeue) - remove the item at the front of the queue
// Peek - get the item at the front of the queue, but don't remove it
// Implementations using arrays and linked lists
