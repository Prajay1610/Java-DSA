package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String args[]) {
        System.out.println('a' + 'b');// prints 195 adds up the ascii values of a and b as it conversts 'a'--> into
                                      // its integer value

        System.out.println("a" + "b");// string concatenation-->prints ab

        System.out.println('a' + 3);// 100 'a'-->97+3=100
        System.out.println((char) ('a' + 3)); // typecasting-->converts 100 into character which is d
        System.out.println("a" + 1);// when a string is added to an integer then it is convereted to its wrapper
                                    // class -->a1

        System.out.println("Prajay" + new ArrayList<>());
        System.out.println("Prajay" + new Integer(56));

    }
}
