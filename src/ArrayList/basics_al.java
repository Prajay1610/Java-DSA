package ArrayList;

import java.util.*;

public class basics_al {
    // Syntax
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(2);
        list.add(654);
        list.add(23);
        list.add(24);

        System.out.println(list);
        list.set(0, 99);
        list.remove(2);
        System.out.println(list);

        System.out.println(list.contains(64));

        Scanner sc = new Scanner(System.in);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);

        // get item @ any index -- here for eg at index 3
        System.out.println(list.get(3));
    }

}
