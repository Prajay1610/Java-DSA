package two_d_Arrays;

import java.util.*;

public class basic_2d {

    public static boolean search(int matrix[][], int n, int m, int key) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at index" + "(" + i + "," + j + ")");
                    return true;
                }

            }

        }
        System.out.println("Not Found");
        return false;

    }

    public static void largestnsmallest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }

            }

        }

        System.out.println("Largest element is: " + largest);
        System.out.println("Smallest element is: " + smallest);

    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        int key = 7;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {// taking input of a 2d array
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int[] row : matrix) {// printing output
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("printing using arrays class");

        System.out.println(Arrays.deepToString(matrix));

        search(matrix, n, m, key);
        largestnsmallest(matrix);

    }

}
