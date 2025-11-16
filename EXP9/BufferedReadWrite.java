import java.io.*;

public class BufferedReadWrite {
    public static void main(String[] args) {
        System.out.println("Nayanika Sethi 24csu137");
        String fileName = "student.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("Serial No: 1");
            bw.newLine();
            bw.write("First Name: Nayanika");
            bw.newLine();
            bw.write("CGPA: 9.2");
            bw.newLine();
            bw.write("Grade: A");
            bw.newLine();
            bw.close();
            System.out.println("Data written successfully.\n");

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Reading data from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}