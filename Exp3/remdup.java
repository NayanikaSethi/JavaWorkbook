import java.util.Scanner;
public class remdup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nayanika Sethi");
        System.out.print("24csu137");
System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();//remove duplicate
        int[] arr = new int[n];
System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();}
int[] temp = new int[n];
        int newLength = 0;
for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newLength; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;}
            }
            if (!isDuplicate) {
                temp[newLength] = arr[i];
                newLength++;}
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(temp[i] + " ");
        } scanner.close();
    }
}