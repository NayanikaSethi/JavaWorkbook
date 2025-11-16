import java.util.Scanner;

class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}


interface Pet {
    void friendly();
}


interface Wild {
    void dangerous();
}


class Dog extends Animal implements Pet, Wild {
    public void friendly() {
        System.out.println("Dogs are friendly pets");
    }
    public void dangerous() {
        System.out.println("Some dogs can be dangerous");
    }
}

public class Interface1 {
    public static void main(String[] args) {
    	System.out.print("Nayanika Sethi 24csu137");
        Dog d = new Dog();
        d.eat();
        d.friendly();
        d.dangerous();
    }
}