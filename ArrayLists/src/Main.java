import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")

public class Main {
    // Array list implements the List<interface>
    // ArrayLists perform poorly for inserting items (excluding end), removing and accessing an item without the index

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        // add - Add an item to the end of the list or specify the index to add
        employeeList.add(new Employee("Jane", "Jones", 123)); // O(1) add to end of list
        employeeList.add(new Employee("John", "Doe", 546));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
        employeeList.add(0, new Employee("Bruce", "Wayne", 707)); // O(n) shifting items right

        // get - query an item at specified index, O(1)
        employeeList.get(1);

        // set - replace item at specified index, O(1)
        employeeList.set(1, new Employee("John", "Adams", 4568));

        // size - returns number of items added to the list O(1)
        employeeList.size();

        // contains - returns T/F if the item exists in the arraylist
        // Need to override the equals and hashcode methods for object arrays
        System.out.println(employeeList.contains(new Employee("Bruce", "Wayne", 707)));

        // indexOf - returns the first index of a item
        employeeList.indexOf(new Employee("Bruce", "Wayne", 707));

        // remove - remove an item at index or specified object/value O(n)
        // Shifting of elements may be required unless rmeoving from the end of the array
        employeeList.remove(1);
        employeeList.remove(new Employee("Mike", "Wilson", 3245));

        // Print items
        employeeList.forEach(System.out::println);
    }
}