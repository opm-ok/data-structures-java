import java.util.Objects;

public class SuperHero {

    private String firstName;
    private String lastName;
    private int powerLevel;

    public SuperHero(String firstName, String lastName, int powerLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.powerLevel = powerLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperHero superHero = (SuperHero) o;
        return powerLevel == superHero.powerLevel &&
                firstName.equals(superHero.firstName) &&
                lastName.equals(superHero.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, powerLevel);
    }
}
