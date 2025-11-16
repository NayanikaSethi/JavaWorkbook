import java.util.Scanner;

public class Car1 extends Vehicle1 {
    int speed;

    
    public Car1(String brand, int speed) {
        super(brand);  
        this.speed = speed;
        System.out.println("Car constructor called");
    }

    
    @Override
    void run() {
        System.out.println(brand + " car is running at " + speed + " km/h");
    }
}