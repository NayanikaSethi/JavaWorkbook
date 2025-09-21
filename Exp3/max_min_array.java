import java.util.Scanner;
class max_min_array {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nayanika Sethi");
        System.out.print("24csu137");
		int n;
		System.out.print("enter the length of the array ");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}

		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println("the maximum number is "+max);
		System.out.println("the minimum number is "+min);
	}
}



