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
    }

    // Put - implements Linear Probing
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
        int hashedKey = hashKeyFunction(key);

        return hashtable[hashedKey];
    }

    // Print
    public void print(){
        System.out.println("Hashtable: ");
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(i + " - " + hashtable[i]);
        }
    }
}


