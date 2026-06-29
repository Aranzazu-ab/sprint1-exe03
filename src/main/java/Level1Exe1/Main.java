package Level1Exe1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Month> months = new ArrayList<>();
        months.addAll(List.of(new Month("January"),
                new Month("February"),
                new Month("March"),
                new Month("April"),
                new Month("May"),
                new Month("June"),
                new Month("July"),
                new Month("September"),
                new Month("October"),
                new Month("November"),
                new Month("December")));

        System.out.println("Arraylist without August" + months);

        months.add(7, new Month("August"));

        System.out.println("Arraylist with August" + months);

        HashSet<Month> monthsSet = new HashSet<>(months);

        System.out.println("HashSet: " + monthsSet);
        System.out.println("Number elements in HashSet: " + monthsSet.size());

        monthsSet.add(new Month("January"));
        System.out.println("...Try to add January...");
        System.out.println("HashSet: " + monthsSet);
        System.out.println("New number elements in HashSet: " + monthsSet.size());

        System.out.println("For-each Arraylist: ");
        for (Month month : months) {
            System.out.println(month);
        }

        System.out.println("For-each MonthSet: ");
        for (Month month : monthsSet) {
            System.out.println(month);
        }

        System.out.println("Iterator ArrayList: ");
        Iterator<Month> it = months.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}