package Practices;
import java.util.ArrayList;
import java.util.*;
public class decendingarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        ArrayList<Integer> ascending = new ArrayList<>(numbers);
        Collections.sort(ascending);
        ArrayList<Integer> descending = new ArrayList<>(numbers);
        Collections.sort(descending, Collections.reverseOrder());
        System.out.println("Input: " + numbers);
        System.out.println("Output (ascending): " + ascending);
        System.out.println("Output (descending): " + descending);

    }
}
