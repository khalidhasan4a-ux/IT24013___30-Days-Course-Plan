import java.util.TreeSet;

public class IT24013 {

    public static void main(String[] args) {

        // Create TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3); // duplicate

        // Display sorted set
        System.out.println("Numbers in TreeSet: " + numbers);

        // Check element
        if(numbers.contains(5)){
            System.out.println("5 is present in the set.");
        }

        // Remove element
        numbers.remove(8);

        System.out.println("After removal: " + numbers);
    }
}
