import java.util.Scanner;

abstract class Bank {
    abstract void getBalance();
}


class BankA extends Bank {
    void getBalance() {
        System.out.println("Bank A Balance: $100");
    }
}

class BankB extends Bank {
    void getBalance() {
        System.out.println("Bank B Balance: $150");
    }
}

class BankC extends Bank {
    void getBalance() {
        System.out.println("Bank C Balance: $200");
    }
}


public class Main3 {
    public static void main(String[] args) {

    System.out.print("Nayanika Sethi 24csu137");

        BankA bankA = new BankA();
        bankA.getBalance();

        BankB bankB = new BankB();
        bankB.getBalance();

        BankC bankC = new BankC();
        bankC.getBalance();
    }
}