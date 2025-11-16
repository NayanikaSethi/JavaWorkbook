import java.util.Scanner;

class ArException {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = 0;

	

	try {
    c = a/b;
	}
	catch(ArithmeticException e) {
		System.out.println("Division by zero");
		System.out.println(e);
	}

	System.out.print(c);
}
}
