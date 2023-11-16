package Basic_Java;

public class ternary_operator {
    public static void main(String args[]) {
        // variable = condition ? statement1:statement2

        int larger = (5 < 3) ? 5 : 3;
        System.out.println(larger);

        String evenodd = (5 % 2 == 0) ? "even" : "odd";
        System.out.println(evenodd);
    }
}
