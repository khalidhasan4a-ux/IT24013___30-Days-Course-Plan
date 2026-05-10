import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IT24013 {

    public static void main(String[] args) {

        Scanner scanner =
                new Scanner(System.in);

        // User name
        System.out.print(
                "Enter your name: ");

        String name =
                scanner.nextLine();

        // User birthdate
        System.out.print(
                "Enter birthdate (yyyy-MM-dd): ");

        String birthdateInput =
                scanner.nextLine();

        // Parse string to LocalDate
        LocalDate birthdate =
                LocalDate.parse(birthdateInput);

        // Output format
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(
                        "EEEE, MMM dd, yyyy");

        // Format birthdate
        String formattedBirthdate =
                birthdate.format(formatter);

        // Display result
        System.out.println(
                "Hello " + name
                + "! Your birthdate is: "
                + formattedBirthdate);

        scanner.close();
    }
}
