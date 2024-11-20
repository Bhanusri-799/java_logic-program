// Abstract method and classes
abstract class AbsDemo {
    abstract void calculate(int n); 
}


class Abstract1 extends AbsDemo {
    void calculate(int n) {
        System.out.println("The square of the given number is: " + (n * n));
    }
}


    void calculate(int n) {
        System.out.println("The cube of the given number is: " + (n * n * n));
    }
}

class Abstract3 extends AbsDemo {
    void calculate(int n) {
        System.out.println("The square root of the given number is: " + Math.sqrt(n)); 
    }
}


public class AbsMain {
    public static void main(String args[]) {
        AbsDemo abs1 = new Abstract1(); 
        AbsDemo abs2 = new Abstract2();
        AbsDemo abs3 = new Abstract3();

        abs1.calculate(3); 
        abs2.calculate(4); 
        abs3.calculate(5); 
    }
}