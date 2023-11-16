package Arrays;

import java.util.*;

/*Array Operations
 * Create
 * Input
 * Output
 * Update
 
 */
public class basic_arrays {

    public static void update(int marks[]) {// call by reference

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }

    }

    public static void main(String args[]) {

        // Creating an Array
        // dataType arrayName[] = new dataType[size]
        int marks[] = new int[50];

        int numbers[] = { 1, 2, 3 };

        int moreNumbers[] = { 4, 5, 6 };

        String fruits[] = { "apple", "mango", "orange" };

        // Input in array
        Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // operations on array values
        // marks[2] = marks[2]*2;

        for (int i = 0; i < 4; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("maths : " + marks[2]);
        System.out.println("bio : " + marks[3]);

        // Length of arrays
        System.out.println("length of array is: " + marks.length);
        update(marks);

        System.out.println("Marks after update");
        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("maths : " + marks[2]);
        System.out.println("bio : " + marks[3]);
    }

}
