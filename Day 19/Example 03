import java.io.File;

public class IT24013 {

    public static void main(String[] args) {

        String directoryPath =
                "Projects/Java";

        File directory =
                new File(directoryPath);

        if(directory.exists()) {

            boolean deleted =
                    directory.delete();

            if(deleted) {

                System.out.println(
                        "Directory deleted successfully.");
            }
            else {

                System.out.println(
                        "Failed to delete directory.");
            }
        }
        else {

            System.out.println(
                    "Directory does not exist.");
        }
    }
}
