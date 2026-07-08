package Practices;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number of elements to add:");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        System.out.println("\nAccessing elements using index:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }
        System.out.println("\nAccessing elements using enhanced for-loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("\nEnter the index of the element to remove:");
        int removeIndex = scanner.nextInt();
        if (removeIndex >= 0 && removeIndex < numbers.size()) {
            int removedElement = numbers.remove(removeIndex);
            System.out.println("Removed element: " + removedElement);
        } else {
            System.out.println("Invalid index. No element removed.");
        }
        System.out.println("\nEnter an element to check for existence:");
        int elementToCheck = scanner.nextInt();
        if (numbers.contains(elementToCheck)) {
            System.out.println("Element " + elementToCheck + " exists in the list.");
        } else {
            System.out.println("Element " + elementToCheck + " does not exist in the list.");
        }
        System.out.println("\nFinal ArrayList: " + numbers);
        scanner.close();
    }
}