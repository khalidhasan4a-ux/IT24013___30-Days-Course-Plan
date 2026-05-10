import java.io.FileOutputStream;
import java.io.IOException;

public class IT24013 {

    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;

        try {

            // Create output stream
            fileOutputStream =
                    new FileOutputStream("output.txt");

            String data = "Hello, World!";

            // Convert string to bytes
            byte[] byteData = data.getBytes();

            // Write bytes
            fileOutputStream.write(byteData);

            System.out.println(
                    "Data written successfully.");

        }
        catch (IOException e) {

            e.printStackTrace();
        }

        finally {

            // Close stream
            if(fileOutputStream != null) {

                try {

                    fileOutputStream.close();
                }
                catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
    }
}
