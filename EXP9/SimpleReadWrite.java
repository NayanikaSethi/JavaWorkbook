import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class SimpleReadWrite {
    public static void main(String[] args) {
        System.out.println("Nayanika Sethi 24csu137");
        String fileName = "sample.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a sample text written to file.");
            writer.close();
            System.out.println("Data written successfully.");

            FileReader reader = new FileReader(fileName);
            int ch;
            System.out.print("File content: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}