import java.util.Scanner;
class CustomStringException extends Exception {
    private String message;

    public CustomStringException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Custom Exception Message: " + message);
    }
}

public class CustomStringExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Nayanika Sethi 24csu137");
        try {
            throw new CustomStringException("Something went wrong in Custom Exception!");
        } 
        catch (CustomStringException e) {
            e.printMessage();
        }
    }
}