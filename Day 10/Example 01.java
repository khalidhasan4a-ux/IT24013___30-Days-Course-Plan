import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // Adding elements
        students.add("Jadid");
        students.add("Rahim");
        students.add("Karim");
        students.add("Jadid"); // duplicate allowed

        // Display all elements
        System.out.println("Student List:");
        for(String name : students) {
            System.out.println(name);
        }

        System.out.println("------");

        // Access by index
        System.out.println("Element at index 1: " + students.get(1));
    }
}
