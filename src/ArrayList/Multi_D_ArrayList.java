package ArrayList;

import java.util.*;

public class Multi_D_ArrayList {

    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);

        // initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        Scanner sc = new Scanner(System.in);

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}
