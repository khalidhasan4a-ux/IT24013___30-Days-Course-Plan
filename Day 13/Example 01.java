import java.util.HashMap;

public class IT24013 {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Access value
        System.out.println("Value for Apple: " +
                           map.get("Apple"));

        // Iterate through HashMap
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        // Check key
        if(map.containsKey("Banana")){
            System.out.println("Banana exists in map.");
        }

        // Remove element
        map.remove("Cherry");

        System.out.println("After removal: " + map);
    }
}
