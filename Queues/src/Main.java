public class Main {

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue(4);

        SuperHero batman = new SuperHero("Bruce", "Wayne", 1000);
        SuperHero superman = new SuperHero("Clark", "Kent", 9000);
        SuperHero spiderman = new SuperHero("Peter", "Parker", 1250);
        SuperHero hulk = new SuperHero("Bruce", "Banner", 4500);
        SuperHero ironman = new SuperHero("Tony", "Stark", 2500);
        SuperHero shazam = new SuperHero("Billy", "Batson", 3000);
        SuperHero flash = new SuperHero("Barry", "Allen", 6000);
        
        queue.add(batman);
        queue.add(superman);
        queue.add(spiderman);
        queue.add(hulk);
        queue.add(ironman);
        queue.add(shazam);
        queue.add(flash);

        System.out.println("Removed: " + queue.remove() );
        System.out.println("Peek: " + queue.peek());


        System.out.println("\nSize of Queue: " + queue.size());

        queue.print();
    }
}

// Abstract data type
// FIFO
// Add (Enqueued) - adds an item to the end of the queue
// Remove (Dequeue) - remove the item at the front of the queue
// Peek - get the item at the front of the queue, but don't remove it
// Implementations using arrays and linked lists
