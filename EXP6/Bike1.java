import java.util.Scanner;

public class Bike1 extends Vehicle1 {
    String type;

    
    public Bike1(String brand, String type) {
        super(brand);  
        this.type = type;
        System.out.println("Bike constructor called");
    }

    
    @Override
    void run() {
        System.out.println(brand + " bike of type " + type + " is running smoothly");
    }
}