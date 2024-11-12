// Addition of two numbers by using user defined Method(no return and no arguments values)

class Addition {
    int a, b, c;

    void add() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("The addition value is: " + c);
    }
}

public class Add {
    public static void main(String args[]) {
        Addition a1 = new Addition();
        a1.add();
    }
}