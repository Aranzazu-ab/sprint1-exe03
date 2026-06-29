package Level1Exe2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ManageList {

    public static List<Integer> reverseList(List<Integer> originalList) {
        List<Integer> reversed = new ArrayList<>();
        ListIterator<Integer> it = originalList.listIterator(originalList.size());
        while (it.hasPrevious()) {
            reversed.add(it.previous());
        }
        return reversed;
    }
}
