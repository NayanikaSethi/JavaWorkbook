import java.util.Scanner;

class Point {
    private float x, y;

    // Non-parameterized constructor
    Point() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() { return x; }
    public float getY() { return y; }
    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y; }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public void display() {
        System.out.printf("%7.2f %7.2f\n", x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nayanika Sethi");
        System.out.print("24csu137");
        System.out.print("Enter coordinates of Point 1 (x y): ");
        float x1 = sc.nextFloat(), y1 = sc.nextFloat();
        Point p1 = new Point(x1, y1);

        System.out.print("Enter coordinates of Point 2 (x y): ");
        float x2 = sc.nextFloat(), y2 = sc.nextFloat();
        Point p2 = new Point(x2, y2);

        System.out.print("Point 1: "); p1.display();
        System.out.print("Point 2: "); p2.display();

        double dist = Point.distance(p1, p2);
        System.out.printf("Distance = %.2f\n", dist);
    }
}