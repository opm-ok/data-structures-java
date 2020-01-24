public class Main {

    public static void main(String[] args) {

        SuperHero batman = new SuperHero("Bruce", "Wayne", 999);
        SuperHero flash = new SuperHero("Barry", "Allen", 2000);
        SuperHero spiderman = new SuperHero("Peter", "Parker", 700);
        SuperHero superman = new SuperHero("Clark", "Kent", 700);
        SuperHero hulk = new SuperHero("Bruce", "Banner", 900);
        SuperHero hawk = new SuperHero("Clinton", "Barton", 400);

        // HASHTABLE - LINEAR PROBING
        SimpleHashtable hashtable = new SimpleHashtable();

        hashtable.put("batman", batman); // add to 6
        hashtable.put("flash", flash); // add to 5
        hashtable.put("spiderman", spiderman ); // add to 9
        hashtable.put("superman", superman ); // add to 8
        hashtable.put("hulk", hulk); // add to 4

        // add to 7 (4 is occupied by hulk, 5 and 6 are occupied, the next available index is 7) - LINEAR PROBING
        hashtable.put("hawk", hawk);


        // HASHTABLE - CHAINING
        ChainedHashtable chainedHashtable = new ChainedHashtable();
        chainedHashtable.put("batman", batman);
        chainedHashtable.put("superman", superman);
        chainedHashtable.put("spiderman", spiderman);
        chainedHashtable.put("flash", flash);
        chainedHashtable.put("hulk", hulk);
        chainedHashtable.put("hawk", hawk);

        System.out.println(chainedHashtable.remove("hawk"));

        chainedHashtable.print();

    }
}

// Abstract data types
// Provide access to data using keys
// Key doesn't have to be an integer
// Key/value pairs - different types are allowed
// Optimized for retrieval
// Associative array is one type of hash table

// Maps keys of any data type to an integer
// Hash function maps keys to int
// Object.hasCode()
// Collision occurs when more than one value has the same hashed value

// Load factor:
// Tells us how full a hash table is
// Load factor = # of items/ capacity  (basically size / capacity)
// Load factor is used to decide when to resize the array backing the hash table
// Don't want load factor too low (lots of empty space)
// Don't want load factor too high (will increase the likelihood of collisions)
// Can impact time complexity for retrieval

// Adding to a Hash table (backed by an array)
// 1. Provide key/value pair
// 2. Use a hash function to hash the key to an int value
// 3. Store the value at the hashed key value - this is the index into the array

// Retrieve a value from a hash table
// 1. Provide the key
// 2. Use the same hash function to hash the key to an int value
// 3. Retrieve the value stored at the hashed key value


// COLLISION
// Collection occurs when more than one value has the same hashed value
// Dealing with collision
//      1) OPEN ADDRESSING (AO)
                // Linear Probing
                // If the position is taken, we look for another position in the array
//      2) CHAINING
                // LinkedList in each index of an array, collisions are stored together in a LinkedList





