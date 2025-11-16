import java.util.Scanner;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private int sub1, sub2, sub3;

    public A(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    double getPercentage() {
        int total = sub1 + sub2 + sub3;
        return (total / 3.0);
    }
}

class B extends Marks {
    private int sub1, sub2, sub3, sub4;

    public B(int sub1, int sub2, int sub3, int sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    double getPercentage() {
        int total = sub1 + sub2 + sub3 + sub4;
        return (total / 4.0);
    }
}

public class Main4 {
    public static void main(String[] args) {

        System.out.print("Nayanika Sethi 24csu137");

        A studentA = new A(85, 90, 95);
        B studentB = new B(75, 80, 85, 90);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}