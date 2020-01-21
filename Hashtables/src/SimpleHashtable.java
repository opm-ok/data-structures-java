public class SimpleHashtable {

    private SuperHero[] hashtable;

    public SimpleHashtable(){
        hashtable = new SuperHero[10];
    }

    // Hashing algorithm (very basic)
    private int hashKeyFunction(String key){
        return key.length() % hashtable.length;
    }

    // Occupied
    private boolean occupied(String key){
        int hashKey = hashKeyFunction(key);
        return hashtable[hashKey] != null;
    }


    // Put
    public void put(String key, SuperHero value){
        int hashedKey = hashKeyFunction(key);
        hashtable[hashedKey] = value;
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
