import java.util.Scanner;
class hello {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nayanika Sethi");
    System.out.print("24csu137");
	System.out.print("enter time in mins");
	int a;
	a = sc.nextInt();
	int b = a/60/24/30;
	System.out.print(b+ "are months ");
	int c = a/60/24;
	System.out.print(c+"are days");
	int d = a/60/24/30/12;
	System.out.print(d+"are years");
	

	}
}