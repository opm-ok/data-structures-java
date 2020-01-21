public class Main {

    public static void main(String[] args) {
        SuperHero batman = new SuperHero("Bruce", "Wayne", 999);
        SuperHero flash = new SuperHero("Barry", "Allen", 2000);
        SuperHero spiderman = new SuperHero("Peter", "Parker", 700);
        SuperHero superman = new SuperHero("Clark", "Kent", 700);

        SimpleHashtable hashtable = new SimpleHashtable();

        hashtable.put("batman", batman);
        hashtable.put("flash", flash);
        hashtable.put("spiderman", spiderman );
        hashtable.put("superman", superman );

        hashtable.print();


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
//      1) Open Addressing (AO)
                // LINEAR PROBING
                // If the position is taken, we look for another position in the array




