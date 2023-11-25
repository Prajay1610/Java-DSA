package Strings;

import javax.swing.plaf.synth.SynthStyle;

public class Performance {
    public static void main(String args[]) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;

        }
        for (int character : series.toCharArray()) {
            System.out.print((char) character + " ");
        }
        System.out.print(series);
    }

}
