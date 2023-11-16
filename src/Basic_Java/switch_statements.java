package Basic_Java;

public class switch_statements {
    public static void main(String args[]) {

        /*
         * switch (variable){
         * case 1:
         * 
         * case 2:
         * 
         * case 3:
         * 
         * case 4:
         * 
         * default:
         * }
         */

        int num = 2;
        switch (num) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                System.out.println("vadapav");
                break;
            default:
                System.out.println("chapati bhaji");
                break;
        }

    }
}
