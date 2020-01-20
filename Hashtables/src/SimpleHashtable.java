public class SimpleHashtable {

    private SuperHero[] hashtable;

    public SimpleHashtable(){
        hashtable = new SuperHero[10];
    }


    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

}
