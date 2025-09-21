import java.util.Scanner;

class CountEvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nayanika Sethi");
        System.out.print("24csu137");

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count even and odd
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Create Even and Odd arrays
        int evenArray[] = new int[evenCount];
        int oddArray[] = new int[oddCount];

        int eIndex = 0, oIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[eIndex++] = arr[i];
            } else {
                oddArray[oIndex++] = arr[i];
            }
        }

        // Display original array
        System.out.print("\nOriginal Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nLength of Original Array: " + n);

        // Display even array
        System.out.print("\nEven Array: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println("\nLength of Even Array: " + evenCount);

        // Display odd array
        System.out.print("\nOdd Array: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println("\nLength of Odd Array: " + oddCount);

        sc.close();
    }
}