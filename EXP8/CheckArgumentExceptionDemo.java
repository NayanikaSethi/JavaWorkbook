import java.util.Scanner;

class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class CheckArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nayanika Sethi 24csu137");
        try {
            System.out.print("Enter number of arguments: ");
            int n = sc.nextInt();
            if (n < 5) {
                throw new CheckArgumentException("Error: Less than 5 arguments entered!");
            }
            int[] numbers = new int[n];
            int sum = 0;
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
                sum += numbers[i];
            }
            System.out.println("Sum of all numbers = " + sum);
        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}