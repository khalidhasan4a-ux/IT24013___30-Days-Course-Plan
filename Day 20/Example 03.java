import java.time.ZonedDateTime;

public class IT24013 {

    public static void main(String[] args) {

        // Get date and time with timezone
        ZonedDateTime zonedNow =
                ZonedDateTime.now();

        System.out.println(
                "Current date and time with zone: "
                + zonedNow);
    }
}
