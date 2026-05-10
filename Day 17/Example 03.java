import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IT24013 {

    public static void main(String[] args) {

        FileInputStream inputFile = null;
        FileOutputStream outputFile = null;

        try {

            // Read source file
            inputFile =
                    new FileInputStream("source.txt");

            // Write destination file
            outputFile =
                    new FileOutputStream("destination.txt");

            int byteData;

            // Copy bytes
            while((byteData =
                    inputFile.read()) != -1) {

                outputFile.write(byteData);
            }

            System.out.println(
                    "File copied successfully.");

        }
        catch (IOException e) {

            e.printStackTrace();
        }

        finally {

            // Close streams
            try {

                if(inputFile != null)
                    inputFile.close();

                if(outputFile != null)
                    outputFile.close();

            }
            catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}
