package Basic_Java.Fuctions;

import java.util.*;

public class f1 {

    public static void printHelloWorld() {// fxn returning nothing but printing helloworld
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    /*
     * Syntax with parameters
     * returnType name(type param1,type param2){
     * 
     * return statement;
     * 
     * 
     * }
     */
    public static int calculatesum(int x, int y) {// parameters or formal parameters
        return x + y;// returning to the fxn which has called this calculatesum fxn
    }

    public static void swapnos(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x is:" + x);
        System.out.println("y is:" + y);
    }

    public static void calcsum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b);// arguments or actual parameters
        System.out.println(sum);

    }
    // calculate the factorial

    public static int factorial(int val) {
        int fact = 1;
        for (int i = 1; i <= val; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static boolean checkprime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;

    }

    // print all primes in a range
    public static void rangeprime(int n) {
        for (int i = 2; i <= n; i++) {
            if (checkprime(i)) {
                System.out.println(i + " ");
            }

        }
    }

    public static int binomialcoefficient(int n, int r) {
        int binom = factorial(n) / (factorial(r) * factorial(n - r));
        return binom;
    }

    public static void main(String args[]) {
        printHelloWorld();// making a fxn call
        calcsum();
        // swap-->exchange values
        int x = 10;
        int y = 40;

        swapnos(x, y);

        System.out.println("x is:" + x);
        System.out.println("y is:" + y);

        System.out.println(factorial(5));

        System.out.println(binomialcoefficient(6, 2));

        // checkprime(19);
        rangeprime(100);

    }

}
