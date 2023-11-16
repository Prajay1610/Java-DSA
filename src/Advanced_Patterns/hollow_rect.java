package Advanced_Patterns;

public class hollow_rect {

    public static void hollow_rectangle(int totalRows, int totalCols) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalCols; j++) {
                if (i == totalRows || i == 1 || j == 1 || j == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        hollow_rectangle(4, 5);
    }
}