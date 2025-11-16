import java.util.Scanner;
class Level1Exception extends Exception {
    public Level1Exception(String msg) {
        super(msg);
    }
}

class Level2Exception extends Level1Exception {
    public Level2Exception(String msg) {
        super(msg);
    }
}

class Level3Exception extends Level2Exception {
    public Level3Exception(String msg) {
        super(msg);
    }
}

class A {
    void show() throws Level1Exception {
        throw new Level1Exception("Exception at Level 1 (Class A)");
    }
}

class B extends A {
    @Override
    void show() throws Level2Exception {
        throw new Level2Exception("Exception at Level 2 (Class B)");
    }
}

class C extends B {
    @Override
    void show() throws Level3Exception {
        throw new Level3Exception("Exception at Level 3 (Class C)");
    }
}

public class ExceptionHierarchyDemo {
    public static void main(String[] args) {
        A obj = new C();
        System.out.println("Nayanika Sethi 24csu137");
        try {
            obj.show();
        } catch (Level1Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}