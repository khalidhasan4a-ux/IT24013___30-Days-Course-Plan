import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // HashSet
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicate ignored

        System.out.println("HashSet:");
        for(String item : fruits) {
            System.out.println(item);
        }

        System.out.println("------");

        // HashMap
        HashMap<Integer,String> student = new HashMap<>();

        student.put(101,"Jadid");
        student.put(102,"Rahim");

        System.out.println("HashMap:");
        System.out.println(student);
    }
}
