import java.util.Scanner;


interface X {
    void methodX();
}

interface Y {
    void methodY();
}


interface Z extends X, Y {
    void methodZ();
}

class ImplementZ implements Z {
    public void methodX() {
        System.out.println("From Interface X");
    }
    public void methodY() {
        System.out.println("From Interface Y");
    }
    public void methodZ() {
        System.out.println("From Interface Z");
    }

    public static void main(String[] args) {

    	System.out.print("Nayanika Sethi 24csu137");
    	
        ImplementZ obj = new ImplementZ();
        obj.methodX();
        obj.methodY();
        obj.methodZ();
    }
}