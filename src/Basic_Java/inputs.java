package Basic_Java;

import java.util.*;

public class inputs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();// only captures the text till first space or next line
        sc.nextLine();// consume the newline character left after sc.next()
        String input2 = sc.nextLine();// only captures the text till first space or next line
        System.out.println(input);
        System.out.println(input2);

        // Type casting/Implicit conversion/widening conversion
        long b = 20;
        double a = b;
        char z = 'b';
        System.out.println(a);
        System.out.println("int of b :" + (int) (z));

        float number = sc.nextInt();
        System.out.println(number);
    }
}