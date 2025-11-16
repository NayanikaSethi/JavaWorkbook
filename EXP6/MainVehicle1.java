import java.util.Scanner;

public class MainVehicle1 {
    public static void main(String[] args) {

    	System.out.println("Nayanika Sethi 24csu137");
        
        Car1 c = new Car1("Toyota", 120);
        c.run();

        System.out.println("-------------------");

        
        Bike1 b = new Bike1("Yamaha", "Sports");
        b.run();
    }
}