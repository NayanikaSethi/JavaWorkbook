import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nayanika Sethi");
        System.out.print("24csu137");
        System.out.print("Enter a character to build rhombus: ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter the size of rhombus (rows): ");
        int n = sc.nextInt();

        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        
        for (int i = n - 1; i >= 1; i--) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}