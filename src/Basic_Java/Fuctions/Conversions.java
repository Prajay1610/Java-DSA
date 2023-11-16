package Basic_Java.Fuctions;

public class Conversions {
    public static void bin_to_dec(int binNum) {
        int myNum = binNum;
        int dec = 0;
        int power = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, power));
            power++;
            binNum = binNum / 10;

        }

        System.out.println("Decimal of " + myNum + " is:" + dec);
    }

    public static void dec_to_bin(int decNum) {
        int myNum = decNum;
        int bin = 0;
        int power = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            bin = bin + (rem * (int) Math.pow(10, power));
            power++;
            decNum = decNum / 2;

        }

        System.out.println("Binary of: " + myNum + " is " + bin);
    }

    public static void main(String args[]) {

        bin_to_dec(110);
        dec_to_bin(7);
    }
}
