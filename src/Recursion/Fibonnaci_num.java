package Recursion;

//print the nth fibonnaci number
public class Fibonnaci_num {
    public static int fib_num(int n) {
        // base condition
        if (n < 2) {
            return n;// return 0 if 0 and return 1 if 1
        }
        return fib_num(n - 1) + fib_num(n - 2);
    }

    public static void main(String args[]) {
        System.out.println(fib_num(3));

    }
}
