import java.util.Scanner;

class reverse_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nayanika Sethi");
        System.out.print("24csu137");
        int n;
        System.out.print("Enter the length of the array: ");
        n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int rev_arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            rev_arr[n - 1 - i] = arr[i];
        }
        
        System.out.print("The reverse of the array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(rev_arr[i] + " ");
        }
    }
}