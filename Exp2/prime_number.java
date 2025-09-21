import java.util.Scanner;
class hello {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nayanika Sethi ");
        System.out.print("24csu137 ");
        int a;
        a = sc.nextInt();
        boolean isPrime = true;   

        if(a < 2) {
            isPrime = false;
        } else {
            for(int i = 2; i <= a/2; i++) {  
                if(a % i == 0) {   
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.print("The number is prime");
        } else {
            System.out.print("The number is not prime");
        }
    }
}