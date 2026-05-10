import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class IT24013 {

    private static final String
            BASE_DIRECTORY = "Documents";

    public static void main(String[] args) {

        Scanner scanner =
                new Scanner(System.in);

        while(true) {

            System.out.println("\n1. Create Directory");
            System.out.println("2. List Directory");
            System.out.println("3. Delete Directory");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {

                case 1:
                    createDirectory(scanner);
                    break;

                case 2:
                    listDirectory(scanner);
                    break;

                case 3:
                    deleteDirectory(scanner);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Create directory
    private static void createDirectory(
            Scanner scanner) {

        System.out.print(
                "New directory name: ");

        Path path =
                Paths.get(BASE_DIRECTORY,
                        scanner.nextLine());

        try {

            Files.createDirectories(path);

            System.out.println(
                    "Created: " + path);

        }
        catch(IOException e) {

            System.out.println(
                    "Error: " + e.getMessage());
        }
    }

    // List directory
    private static void listDirectory(
            Scanner scanner) {

        System.out.print(
                "Directory to list: ");

        Path path =
                Paths.get(BASE_DIRECTORY,
                        scanner.nextLine());

        try {

            Files.list(path)
                    .forEach(System.out::println);

        }
        catch(IOException e) {

            System.out.println(
                    "Error: " + e.getMessage());
        }
    }

    // Delete directory
    private static void deleteDirectory(
            Scanner scanner) {

        System.out.print(
                "Directory to delete: ");

        Path path =
                Paths.get(BASE_DIRECTORY,
                        scanner.nextLine());

        try {

            Files.delete(path);

            System.out.println(
                    "Deleted: " + path);

        }
        catch(IOException e) {

            System.out.println(
                    "Error: " + e.getMessage());
        }
    }
}
