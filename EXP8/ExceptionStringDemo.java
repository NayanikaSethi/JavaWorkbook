import java.util.Scanner;
public class ExceptionStringDemo {
    public static void main(String[] args) {
    	System.out.print("Nayanika Sethi 24csu137");
        try {
            throw new Exception("This is a custom message inside the Exception!");
        } 
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed — program completed.");
        }
    }
}