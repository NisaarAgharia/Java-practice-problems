package DetailedCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setCollection {
    public static void main(String[] args) {
        Set<String> empSet = new LinkedHashSet<String>();
        Set<Integer> intSet = new HashSet<Integer>();
        Set <String> strSet = new TreeSet<String>();

empSet.add("A");
empSet.add("D");
empSet.add("B");
empSet.add("C");
empSet.add("D");
        empSet.add("F");
        System.out.println(empSet);

        intSet.add(2);
        intSet.add(4);
        intSet.add(1);
        intSet.add(100);
        intSet.add(12);
        intSet.add(109);
        intSet.add(200);
        System.out.println(intSet);

        strSet.add("A");
        strSet.add("Z");
        strSet.add("A");
        strSet.add("B");
        strSet.add("C");
        strSet.add("X");
        strSet.add("c");
        strSet.add("b");
        strSet.add("z");
        strSet.add("O");
        System.out.println(strSet);



        empSet.retainAll(strSet);
        System.out.println("empset intersection "+empSet);

        empSet.removeAll(strSet);
        System.out.println("dif "+empSet);

        empSet.addAll(strSet);
        System.out.println("Union empset"+empSet);

        empSet.removeAll(strSet);
        System.out.println(empSet);



    }
}
