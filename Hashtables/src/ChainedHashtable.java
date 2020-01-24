import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    // IMPLEMENTS CHAINING

   private LinkedList<StoredSuperHero>[] hashtable; // create an array of LinkedList

    @SuppressWarnings("ExplicitArrayFilling")
    public ChainedHashtable(){
        this.hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length ; i++) {
            hashtable[i] = new LinkedList<StoredSuperHero>(); //
        }
    }

    // Put
    public void put(String key, SuperHero superHero){
        int hashedKey = hashedFunction(key);
        hashtable[hashedKey].add(new StoredSuperHero(key, superHero));
    }

    // Get
    public StoredSuperHero get(String key){
        int hashedKey = hashedFunction(key);
        for (StoredSuperHero storedSuperHero : hashtable[hashedKey]) {
            if (storedSuperHero.key.equals(key)) {
                return storedSuperHero;
            }
        }
        return null;
    }

    // Remove
    public StoredSuperHero remove(String key){
        int hashedKey = hashedFunction(key);
        int index = 0;
        for (StoredSuperHero storedSuperHero : hashtable[hashedKey]) {
            if (storedSuperHero.key.equals(key)){
                hashtable[hashedKey].remove(index);
                return storedSuperHero;
            }
            index++;
        }
        return null;
    }

    // Print
    public void print(){
        System.out.println("Hashtable:");
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null){
                System.out.println("Index " + i + ": empty");

            } else {
                System.out.print("Index " + i + ": ");
                for (StoredSuperHero storedSuperHero : hashtable[i]) {
                    System.out.print(storedSuperHero.superHero);
                    System.out.print(" -> ");
                }
                System.out.println("null");
            }
        }
    }

    // Hashing algorithm implementation
    private int hashedFunction(String key){
        return key.length() % hashtable.length;
    }
}
