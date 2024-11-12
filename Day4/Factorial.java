// Factorial number by using user defined method 

import java.util.Scanner;

class Factorial {
    int n, fact = 1;

    void mul() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact =fact*i;
        }
        
        System.out.println("The factorial of " + n + " is: " + fact);
    }
}

    public static void main(String args[]) {
        Factorial f1 = new Factorial();
        f1.mul();
    }
