import java.util.Scanner;
//LeftTriangle
public class left_tri {
    public static void main(String[] args) {
        System.out.print("Nayanika Sethi");
        System.out.print("24csu137");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}