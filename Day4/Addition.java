// Addition of two number by using user defined method(no return value,with argument value)
class Addition {
    int a, b, c;

  
    void add(int x, int y) { 
        a = x; 
        b = y; 
        c = a + b;
        System.out.println("The addition value is: " + c);
    }
}

public class Add1 {
    public static void main(String args[]) {
        int m=55,n=15;
        Addition a1 = new Addition();
        a1.add(m, n);  
    }
}