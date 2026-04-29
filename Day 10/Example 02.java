import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> subjects = new LinkedList<>();

        // Add elements
        subjects.add("Java");
        subjects.add("Database");
        subjects.add("Networking");

        // Insert element
        subjects.addFirst("C Programming");

        // Remove element
        subjects.remove("Database");

        System.out.println("Subject List:");

        for(String sub : subjects) {
            System.out.println(sub);
        }
    }
}
