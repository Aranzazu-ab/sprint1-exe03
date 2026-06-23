package Level1Exe2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main (String[] args){
    List<Integer> firstList = new ArrayList<>();

    firstList.add(0);
    firstList.add(1);
    firstList.add(2);
    firstList.add(3);
    firstList.add(4);
    firstList.add(5);
    firstList.add(6);
    firstList.add(7);
    firstList.add(8);
    firstList.add(9);
    firstList.add(10);

    System.out.println("Original: " + firstList);
    List<Integer> secondList = reverseList(firstList);
    System.out.println("Reversed: " + secondList);
    }

    private static List<Integer> reverseList(List<Integer> originalList) {
        List<Integer> reversed = new ArrayList<>();
        ListIterator<Integer> num = originalList.listIterator(originalList.size());
        while(num.hasPrevious()){
        reversed.add(num.previous());
        }
        return reversed;
    }
}

