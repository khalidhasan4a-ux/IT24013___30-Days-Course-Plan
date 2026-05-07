import java.util.TreeMap;

public class IT24013 {

    public static void main(String[] args) {

        // Create TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 1);
        treeMap.put("Cherry", 3);

        // Access value
        System.out.println("Value for Apple: " +
                           treeMap.get("Apple"));

        // Iterate through TreeMap
        for(String key : treeMap.keySet()){
            System.out.println(key + " : " + treeMap.get(key));
        }

        // Check key
        if(treeMap.containsKey("Cherry")){
            System.out.println("Cherry exists in TreeMap.");
        }

        // Remove element
        treeMap.remove("Banana");

        System.out.println("After removal: " + treeMap);
    }
}
