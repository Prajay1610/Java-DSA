package Basic_Java.Patterns;

public class Basic_Patterns {
    public static void main(String args[]) {

        /* Star pattern */
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // inverted Star Pattern
        System.out.println("Inverted star pattern");

        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= (4 - line + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // half Pyramid Pattern
        System.out.println("half Pyramid Pattern");
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print(star);
            }
            System.out.println();
        }

        // Character pattern
        System.out.println("character Pattern");
        int no = 10;
        char starting = 'A';
        for (int line = 1; line <= no; line++) {
            for (int charac = 1; charac <= line; charac++) {

                System.out.print(starting);
                starting++;
            }

            System.out.println();

        }
    }
}
