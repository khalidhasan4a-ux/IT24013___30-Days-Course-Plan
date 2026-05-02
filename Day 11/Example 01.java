import java.util.HashSet;

public class IT24013 {

    public static void main(String[] args) {

        // Create HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana"); // duplicate

        // Display set
        System.out.println("Fruits in HashSet: " + fruits);

        // Check element
        if(fruits.contains("Apple")){
            System.out.println("Apple is present in the set.");
        }

        // Remove element
        fruits.remove("Cherry");

        System.out.println("After removal: " + fruits);
    }
}
