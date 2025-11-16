import java.util.Scanner;


interface A {
    void displayA();
}

interface B extends A {
    void displayB();
}

class Example implements B {
    public void displayA() {
        System.out.println("Display from Interface A");
    }
    public void displayB() {
        System.out.println("Display from Interface B");
    }
    
    public static void main(String[] args) {
        Example obj = new Example();
        obj.displayA();
        obj.displayB();
    }
}