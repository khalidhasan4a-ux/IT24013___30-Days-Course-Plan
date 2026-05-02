import java.util.LinkedList;
import java.util.Queue;

public class IT24013 {

    public static void main(String[] args) {

        // Create queue
        Queue<String> customerQueue = new LinkedList<>();

        // Customers join
        customerQueue.offer("Customer 1");
        customerQueue.offer("Customer 2");
        customerQueue.offer("Customer 3");

        System.out.println("Current Queue: " + customerQueue);

        // Serve first customer
        String servedCustomer = customerQueue.poll();
        System.out.println("Serving: " + servedCustomer);

        System.out.println("Queue after serving one: " + customerQueue);

        // Serve another
        servedCustomer = customerQueue.poll();
        System.out.println("Serving: " + servedCustomer);

        // Final queue
        System.out.println("Final Queue: " + customerQueue);
    }
}
