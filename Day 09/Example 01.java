import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> students = new ArrayList<>();

        students.add("Jadid");
        students.add("Rahim");
        students.add("Jadid"); // duplicate allowed

        System.out.println("ArrayList:");
        for(String name : students) {
            System.out.println(name);
        }

        System.out.println("------");

        // LinkedList
        LinkedList<String> subjects = new LinkedList<>();

        subjects.add("Java");
        subjects.add("Database");
        subjects.add("Networking");

        System.out.println("LinkedList:");
        for(String sub : subjects) {
            System.out.println(sub);
        }
    }
}
