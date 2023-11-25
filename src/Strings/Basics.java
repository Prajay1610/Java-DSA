package Strings;

import java.util.*;

public class Basics {
    public static void main(String args[]) {
        String a = "Prajay";
        String b = new String("Prajay");// creates a new object irrespective of value being the same

        System.out.println(a == b);

        System.out.println(a.equals(b));// checks only values that are these two values eqaul or not --> will return
                                        // true

        System.out.println(a.charAt(0));// returns character at specified index from a string value

        System.out.println(new int[] { 1, 2, 3, 4, 5 });// prints random conversion toString
        System.out.println(Arrays.toString(new int[] { 1, 2, 3, 4, 5 }));// prints conversion toString from Arrays class

        // Pretty Printing

        float ab = 452.1274f;
        System.out.printf("Formatted number is %.2f", ab);// prints and round the num upto 2 places after decimal point
        System.out.println();
        System.out.printf("PI Formatted  %.4f", Math.PI);
        System.out.println();
        System.out.printf("Hello I am %s , I am %d years old", "prajay", 20);

    }
}
