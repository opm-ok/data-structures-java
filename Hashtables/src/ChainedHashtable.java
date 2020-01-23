import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

   private LinkedList<StoredSuperHero>[] hashtable;

    public ChainedHashtable(){
        this.hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length ; i++) {
            hashtable[i] = new LinkedList<StoredSuperHero>();
        }
    }

    public void put(String key, SuperHero superHero){
        int hashedKey = hashedFunction(key);
        StoredSuperHero storedSuperHero = new StoredSuperHero(key, superHero);

        hashtable[hashedKey].add(storedSuperHero);
        System.out.println(hashtable[hashedKey]);
    }

    public void print(){
        System.out.println("Hashtable:");
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] != null){
                System.out.print("Index " + i + ": ");

            }
        }
    }

    private int hashedFunction(String key){
        return key.length() % hashtable.length;
    }






}
