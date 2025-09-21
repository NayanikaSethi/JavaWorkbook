import java.util.Scanner;
class search_arr {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Nayanika Sethi");
    System.out.print("24csu137");
	int n;
	System.out.print("enter the length of array ");
	n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
	System.out.print(arr[i]);
	}

	int b;
	System.out.print("enter the element ");
	b = sc.nextInt();
	for(int i=0;i<n;i++) {
	if(b==arr[i]) {
	System.out.print("the index of the element is "+i);
	break;
	}
	/*else {
	System.out.print("invalid input");
	}*/
	}

	}
}