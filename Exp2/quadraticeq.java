import java.util.Scanner;

class quadraticeq {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nayanika Sethi");
        System.out.println("24csu137");

        double a, b, c;
        System.out.print("Enter the coefficient of x²: ");
        a = scan.nextDouble();
        System.out.print("Enter the coefficient of x: ");
        b = scan.nextDouble();
        System.out.print("Enter the constant term: ");
        c = scan.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0).");
        } else {
            System.out.println("Equation: " + a + "x^2 + " + b + "x + " + c);

            double d = b * b - 4 * a * c;  // discriminant

            if (d > 0) {
                System.out.println("The roots are real and distinct.");
                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Root 1 = " + r1);
                System.out.println("Root 2 = " + r2);
            } else if (d == 0) {
                System.out.println("The roots are real and equal.");
                double r = -b / (2 * a);
                System.out.println("Root = " + r);
            } else {
                System.out.println("The roots are complex.");
                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-d) / (2 * a);
                System.out.println("Root 1 = " + real + " + " + imaginary + "i");
                System.out.println("Root 2 = " + real + " - " + imaginary + "i");
            }
        }

        
    }
}