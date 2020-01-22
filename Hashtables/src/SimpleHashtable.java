public class SimpleHashtable {

    // IMPLEMENTS LINEAR PROBING

    private StoredSuperHero[] hashtable;

    public SimpleHashtable(){
        hashtable = new StoredSuperHero[10];
    }

    // Hashing algorithm (very basic)
    private int hashKeyFunction(String key){
        return key.length() % hashtable.length;
    }

    // Occupied
    private boolean occupied(int hashKey){
        return hashtable[hashKey] != null;
    }

    // Find Key - accepts the raw key as the parameter
    private int findKey(String key){
        int hashedKey = hashKeyFunction(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        else {
            int stopIndex = hashedKey;

            if (hashedKey == hashtable.length -1){
                hashedKey = 0;
            }
            else {
                hashedKey++;
            }

            while (hashedKey != stopIndex // We have traversed the entire array

                    // Linear probing; if the next available value is null, therefore the key must be in the array
                    && hashtable[hashedKey] != null

                   // Continue to traverse if the key value is not correct
                    && !hashtable[hashedKey].key.equals(key)){

                hashedKey = (hashedKey + 1 % hashtable.length); // increment hashedKey
            }
            // After traversing and locating the correct key or looping through the entire array


            if (!hashtable[hashedKey].key.equals(key)){
                return -1;
            }
        }
        return hashedKey;
    }


    // Put
    public void put(String key, SuperHero value){
        int hashedKey = hashKeyFunction(key);

        // if the occupied - traverse the array until an empty index is found or we loop through the entire array
        if (occupied(hashedKey)){
            int stopIndex = hashedKey;

            // if the current hashKey is at the end of the index, wrap to the front of the array
            if (hashedKey == hashtable.length -1){
                hashedKey = 0;
            }
            // else go to the next index
            else {
                hashedKey++;
            }

            // loop until an empty index is found or we loop through the entire array
            while (occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        // Traversed through the entire array and no empty indexes
        if (occupied(hashedKey)){
            System.out.println("Full Hashtable. Cannot add " + value);
        }
        // Add value to the null index that was found
        else {
            hashtable[hashedKey] = new StoredSuperHero(key, value);
        }
    }

    // Get
    public SuperHero get(String key){
        int hashedKey = findKey(key);
        if (hashedKey == -1){
            return null;
        }
        return hashtable[hashedKey].superHero;
    }

    // Remove
    public SuperHero remove(String key){
        int hashedKey = findKey(key);

        // if the key was found in the array
        if (hashtable[hashedKey] != null){

            // Store and then null value at the hashedKey
            StoredSuperHero removedSuperHero = hashtable[hashedKey];
            hashtable[hashedKey] = null;

            // Recreate hashtable, rehashing each key and adjusting hashtable
            StoredSuperHero[] oldHashtable = hashtable;
            hashtable = new StoredSuperHero[oldHashtable.length];

            for (StoredSuperHero storedSuperHero : oldHashtable) {
                if (storedSuperHero != null) {
                    put(storedSuperHero.key, storedSuperHero.superHero);
                }
            }
            return removedSuperHero.superHero;
        }
        return null;
    }

    // Print
    public void print(){
        System.out.println("\nHashtable: ");
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(i + " - " + hashtable[i]);
        }
    }
}



