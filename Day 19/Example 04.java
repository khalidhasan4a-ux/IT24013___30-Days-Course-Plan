import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IT24013 {

    public static void main(String[] args) {

        Path path =
                Paths.get("Projects/NioExample");

        try {

            Path createdDir =
                    Files.createDirectories(path);

            System.out.println(
                    "Directory created: "
                    + createdDir.toString());

        }
        catch(IOException e) {

            System.out.println(
                    "Error: "
                    + e.getMessage());
        }
    }
}
