package level01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main (String[] args){

        ArrayList<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        System.out.println("Arraylist without August" + months);

        months.add(7, new Month("August"));

        System.out.println("Arraylist with August" +months);

        HashSet<Month> monthsSet = new HashSet<>(months);

        System.out.println("HashSet: " +monthsSet);
        System.out.println("Number elements in HashSet: " + monthsSet.size());

        monthsSet.add(new Month("January"));
        System.out.println("...Try to add January...");
        System.out.println("HashSet: " +monthsSet);
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
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        printMonths ("For-each ArrayList:", months);
//        printMonths ("For-each MonthSet:", monthsSet);

    }
//    private static void printMonths(String title, Iterable<Month> collection) {
//        System.out.println(title);
//        for (Month month : collection) {
//            System.out.println(month);
//        }
//    }
}
