package Strings;

import java.util.*;

public class Methods {
    public static void main(String args[]) {
        String name = "Prajay Chavan";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.concat("Cura"));
        System.out.println(name.indexOf('a'));// gets the first occurence index of a character mentioned here
        System.out.println("     Prajay       ".strip());
        System.out.println(Arrays.toString(name.split(" ")));// splits array from the mentoined expression

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
