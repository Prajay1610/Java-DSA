package Recursion;

public class basics {
    static void message(int count) {
        if (count > 0) {
            System.out.println("Hello World");
            count--;
            message(count);
        }

    }

    static void printnum(int n) {

        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printnum(n + 1);
    }

    public static void main(String args[]) {
        // message(5);
        printnum(1);

    }
}
