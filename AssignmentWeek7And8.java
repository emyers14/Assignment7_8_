/*
 * Name: Ethan Myers
 * Professor: Dr. Young J Kim
 * Class: Algorithms and Data Structures
 * Due Date: 10/23/2024
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AssignmentWeek7And8 {
    
    // Task 1: Add user-defined names and search for a name
    public static void addAndSearchNames() {
        List<String> names = new ArrayList<>();
        names.add("Lena");
        names.add("Nicholas");
        names.add("Aruna");
        names.add("Anthony");
        names.add("Daniel");
        names.add("Thomas");

        String searchName = "Lena"; 
        if (names.contains(searchName)) {
            System.out.println("Found the name: " + searchName);
        } else {
            System.out.println("No such name: " + searchName);
        }
    }

    // Task 2: Add integers with one repeated and find the repeated number
    public static int findRepeatedNumber(int n) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        
        // Generate random numbers from 1 to n-1 with one repeated number
        int repeatedNumber = rand.nextInt(n - 1) + 1;
        for (int i = 1; i < n; i++) {
            numbers.add(i);
        }
        numbers.add(repeatedNumber);

        // Find the repeated number
        int[] count = new int[n];
        for (int num : numbers) {
            count[num]++;
            if (count[num] > 1) {
                return num;
            }
        }
        return -1; // If no repeated number is found
    }

    // Task 3: Throw an error for accessing beyond ArrayList boundary
    public static void checkArrayListBounds() {
        List<String> names = new ArrayList<>();
        names.add("Lena");
        names.add("Nicholas");
        names.add("Aruna");

        try {
            System.out.println(names.get(10)); // Trying to access the 11th element
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Task 4: Implement trimToExactSize method for ArrayList
    public static <E> void trimToExactSize(ArrayList<E> list) {
        ArrayList<E> trimmedList = new ArrayList<>(list.size());
        for (E element : list) {
            trimmedList.add(element);
        }
        System.out.println("ArrayList trimmed to exact size: " + trimmedList);
    }

    public static void main(String[] args) {
        // Task 1: Add names and search for a specific one
        System.out.println("Task 1: Add and Search Names");
        addAndSearchNames();

        // Task 2: Find the repeated number in a list of numbers
        int n = 10; 
        System.out.println("Task 2: Repeated number is " + findRepeatedNumber(n));

        // Task 3: ArrayList bounds check
        System.out.println("Task 3: Check ArrayList Bounds");
        checkArrayListBounds();

        // Task 4: Trim ArrayList to exact size
        ArrayList<String> names = new ArrayList<>();
        names.add("Lena");
        names.add("Nicholas");
        names.add("Aruna");
        names.add("Anthony");
        System.out.println("Task 4: Trim ArrayList");
        trimToExactSize(names);
    }
}
