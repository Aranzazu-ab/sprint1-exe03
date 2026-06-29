package Level1Exe2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> firstList = List.of(0,1,2,3,4,5,6,7,8,9,10);
        System.out.println("Original: " + firstList);

        List<Integer> secondList = ManageList.reverseList(firstList);
        System.out.println("Reversed: " + secondList);
    }
}

