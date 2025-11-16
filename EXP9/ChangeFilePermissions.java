import java.io.File;
import java.util.Scanner;

public class ChangeFilePermissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nayanika Sethi 24csu137");
        System.out.print("Enter file path: ");
        String path = sc.nextLine();
        File file = new File(path);

        if (file.exists()) {
            System.out.println("Changing file permissions...");
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(false);
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
        } else {
            System.out.println("File not found.");
        }
        sc.close();
    }
}