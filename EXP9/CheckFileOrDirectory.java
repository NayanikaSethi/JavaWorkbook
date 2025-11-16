import java.io.File;
import java.util.Scanner;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nayanika Sethi 24csu137");
        System.out.print("Enter the file or directory path: ");
        String path = sc.nextLine();
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("The specified path does not exist.");
        } else if (file.isFile()) {
            System.out.println("It is a file.");
        } else if (file.isDirectory()) {
            System.out.println("It is a directory.");
        }
        sc.close();
    }
}