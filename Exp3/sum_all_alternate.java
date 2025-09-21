import java.util.Scanner;
class sum_all_alternate {
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
	int sum=0;
	for(int i=0;i<n;i++) {
	sum=sum+arr[i];

	}
	System.out.print("the sum of the elements of array is" + sum);
	int sum_alter=0;
	for(int i=0;i<n;i++) {
	if(i%2==0) {
	sum_alter+=arr[i];
	}
	System.out.print("the sum of alternate elements "+sum_alter);
	}
	}
}