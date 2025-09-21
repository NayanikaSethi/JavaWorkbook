import java.util.Scanner;
class hello {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Nayanika Sethi");
    System.out.print("24csu137");
	char a;
	a = scan.next().charAt(0);
	char[] arr = {'a','e','i','o','u'};
	for(int i=0;i<5;i++) {
	if(a==arr[i]) {
	System.out.print("the char is a vowel");
	break;
	}
	else 
	{
	System.out.print("the char is a consonant");
	}
	}

	}
}