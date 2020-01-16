import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayListStack {

    // Implementation of a Stack using an Array List

    private Deque<Employee> arrayListStack = new ArrayDeque<>();

    public void push(Employee employee){
        arrayListStack.push(employee);
    }

    public Employee pop(){
        return arrayListStack.pop();
    }

    public Employee peek(){
        return arrayListStack.peek();
    }

    public int getSize(){
        return arrayListStack.size();
    }

    public boolean isEmpty(){
        return arrayListStack.isEmpty();
    }

    public void print(){
        for (Employee emp : arrayListStack) {
            System.out.println(emp);
        }
    }
}

