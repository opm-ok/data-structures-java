public class StoredSuperHero {

    public String key; // the raw key, not the hashedKey
    public SuperHero superHero;

    public StoredSuperHero(String key, SuperHero superHero) {
        this.key = key;
        this.superHero = superHero;
    }

    @Override
    public String toString() {
        return key + ": " + superHero;
    }
}
