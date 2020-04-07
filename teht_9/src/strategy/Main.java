package strategy;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        //List list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        PrintList printList = new PrintList(One.getInstance());
        System.out.println("1:");
        printList.print(list);

        printList.setConverter(Two.getInstance());
        System.out.println("2:");
        printList.print(list);

        printList.setConverter(Three.getInstance());
        System.out.println("3:");
        printList.print(list);
    }
}
