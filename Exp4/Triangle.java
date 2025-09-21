import java.util.Scanner;
class Triangle {
    int a, b, c;

    Triangle() {
        a = 3;
        b = 4;
        c = 5;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        int perimeter = t.a + t.b + t.c;
        double s = perimeter / 2.0;
        double area = Math.sqrt(s * (s - t.a) * (s - t.b) * (s - t.c));

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}