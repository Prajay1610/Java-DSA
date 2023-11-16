package Basic_Java;

import java.util.*;

public class loops {
    public static void main(String args[]) {
        // while loop
        /*
         * while (condition){
         * do something
         * }
         */

        int a = 0;
        while (a <= 100) {
            System.out.println(a);
            a++;
        }

        // prime numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 1;
        // while (counter <= range) {
        // if (counter % range == 0) {
        // System.out.println(range);
        // }

        // }

        System.out.println("For loop");
        /*
         * for(initialization;condition;updation){
         * do something
         * }
         */

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("printing Square Pattern");
        for (int i = 1; i <= 4; i++) {
            System.out.println("****");

        }

        System.out.println("Sum of first n natural numbers");

        int sum = 0;
        int n = sc.nextInt();
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);

        System.out.println("Print reverse of number");

        int num = sc.nextInt();

        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num /= 10;

        }
        System.out.println();

        System.out.println("Reverse a number and store it in another int and print it");

        /*
         * s-1:intialize rev with 0;
         * s-2:find lastDigit by n%10
         * s-3:find rev by rev = (rev*10)+lastdigit;
         * s-4:remove lastDigit by num = num/10;
         */

        int no = sc.nextInt();
        int rev = 0;
        while (no > 0) {
            int lastDig = no % 10;
            rev = (rev * 10) + lastDig;
            no /= 10;

        }

        System.out.println("reverse of no is:" + rev);

        System.out.println("do while loop");
        /*
         * do{
         * //do something
         * }
         * while(condition);
         */

        int counter = 1;
        do {
            System.out.println("hello World");
            counter++;
        } while (counter <= 10);

        /*
         * Break && Continue Kyewords
         * 
         * Break --> used to exit from some loop
         * Continue--> used to skip an iteration
         */

        /* try this by do while loop aslo */

        System.out.println("Keep entering  numbers till user enters multiple of 10");
        int i = sc.nextInt();
        while (true) {
            if (i % 10 == 0) {
                System.out.println("Multiple of 10 found i.e:" + i);
                break;
            }

            System.out.println(i);
            i = sc.nextInt();

        }
    }
}
