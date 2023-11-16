package Basic_Java;

public class operators {
    public static void main(String args[]) {
        // unary operators --> ++ --
        // Binary operators-->+ ,- ,/,%,*
        int a = 10;
        int b = a++;
        System.out.println(b);
        System.out.println(a);

        // relational operators--> == , != , > ,<,>=,<=
        // assignment operators = , += ,-=,*=,/=

        int sum = 0, product = 2;
        sum += a;
        product *= a;
        System.out.println(product);
        System.out.println(sum);

        // Logical operators --> && ,||,!

        System.out.println((3 > 2) && (5 > 0));
        System.out.println((3 > 2) || (5 > 0));
        System.out.println(!((3 > 2) || (5 > 0)));// negation/not

    }
}
