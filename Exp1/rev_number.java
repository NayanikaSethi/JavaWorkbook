import java.util.Scanner;
class hello {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nayanika Sethi");
    System.out.print("24csu137");
	int a,m,b;
	System.out.print("enter a three digit number");
	a = sc.nextInt();
	b = a%10;
	a = a/10;
	m = a%10;
	a = a/10;
	int reverse = b*100 + m*10 + a;
	System.out.print("the reverse number is" + reverse);


	}
}