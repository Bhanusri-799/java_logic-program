// Bubble sort


import java.util.Scanner;

class Sorr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, t;

        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter elements of the array:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The elements before sorting:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
         
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        System.out.println("The elements after sorting:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}