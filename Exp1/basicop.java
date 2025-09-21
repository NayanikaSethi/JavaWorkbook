import java.util.Scanner;

class hello {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nayanika Sethi");
        System.out.print("24csu137");
        
        int d, e, result;
        String choice;

        System.out.print("Enter first number: ");
        d = scan.nextInt();

        System.out.print("Enter second number: ");
        e = scan.nextInt();

        System.out.print("Enter operation (a=add, s=subtract, m=multiply, d=divide, r=remainder): ");
        choice = scan.next();

        if(choice.equals("a")) {
            result = d + e;
            System.out.println("Result = " + result);
        } else if(choice.equals("s")) {
            result = d - e;
            System.out.println("Result = " + result);
        } else if(choice.equals("m")) {
            result = d * e;
            System.out.println("Result = " + result);
        } else if(choice.equals("d")) {
            result = d / e;
            System.out.println("Result = " + result);
        } else if(choice.equals("r")) {
            result = d % e;
            System.out.println("Result = " + result);
        } else {
            System.out.println("Invalid choice!");
        }

        
    }
}