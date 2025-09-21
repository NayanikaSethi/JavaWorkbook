import java.util.Scanner;

class Complex {
    double real, imag;

    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    Complex multiply(Complex c) {
        return new Complex(this.real * c.real - this.imag * c.imag,
                           this.real * c.imag + this.imag * c.real);
    }

    void display() {
        System.out.printf("%.2f + %.2fi\n", real, imag);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nayanika Sethi");
        System.out.print("24csu137");
        System.out.print("Enter real & imaginary part of first complex number: ");
        double r1 = sc.nextDouble(), i1 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);

        System.out.print("Enter real & imaginary part of second complex number: ");
        double r2 = sc.nextDouble(), i2 = sc.nextDouble();
        Complex c2 = new Complex(r2, i2);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        System.out.print("Sum = "); sum.display();
        System.out.print("Difference = "); diff.display();
        System.out.print("Product = "); prod.display();
    }
}