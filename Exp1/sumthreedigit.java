import java.util.Scanner;
class hello{
	public static void main(String args[]) {
    System.out.print("Nayanika Sethi");
    System.out.print("24csu137");
	Scanner scan = new Scanner(System.in);
	int a,last,slast,first,sum;
	System.out.print("enter a three digit number");
	a = scan.nextInt();

	last=a%10;

	slast=last%10;
	
	first=slast%10;

	sum=last + slast + first;
	System.out.print(sum);

	}
}