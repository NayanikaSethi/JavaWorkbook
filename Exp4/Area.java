import java.util.Scanner;

class Area {
    int length, breadth;

    Area(int l, int b) {
        length = l;
        breadth = b;
    }

    int returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nayanika Sethi");
        System.out.print("24csu137");
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        Area rect = new Area(l, b);
        System.out.println("Area of Rectangle = " + rect.returnArea());
    }
}