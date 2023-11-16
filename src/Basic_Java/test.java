package Basic_Java;

import java.util.*;

public class test {

    public static void main(String args[]) {
        byte b1 = 8;
        char ch = 'a';
        boolean b2 = true;
        boolean b3 = false;
        float p2 = 20.56f;
        double price = 10.5;
        int b = 20;
        int a = 10;
        Scanner sc = new Scanner(System.in);// taking input values
        int x = sc.nextInt();// taking input for int x
        int y = sc.nextInt();// taking input for int y

        float radius = sc.nextInt();
        int sum = x + y;
        int prod = x * y;
        float pie = 3.14f;

        float area = pie * (radius) * (radius);

        System.out.println("Sum is:" + sum);
        System.out.println("Product is:" + prod);
        System.out.println("Area of circle is:" + area);
        // float price = 10.5;
        String name = "Prajay Chavan";
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        System.out.println(b);
        System.out.println(a);
        System.out.println(name);
        System.out.println(b1);
        System.out.println(ch);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(price);
        System.out.println(p2);

    }
}