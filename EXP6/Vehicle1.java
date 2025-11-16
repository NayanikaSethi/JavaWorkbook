import java.util.Scanner;

public class Vehicle1 {
    String brand;

 
    public Vehicle1(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called for brand: " + brand);
    }

    
    void run() {
        System.out.println("Vehicle is running");
    }
}