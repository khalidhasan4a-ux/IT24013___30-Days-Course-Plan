import java.util.LinkedList;
import java.util.Queue;

public class IT24013 {

    public static void main(String[] args) {

        // Create Queue
        Queue<String> queue = new LinkedList<>();

        // Enqueue (add elements)
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        // Display queue
        System.out.println("Queue: " + queue);

        // Dequeue (remove first element)
        String removedItem = queue.poll();
        System.out.println("Removed Item: " + removedItem);

        // Display after dequeue
        System.out.println("Queue after dequeue: " + queue);
    }
}
