package DetailedCollections;

import java.util.*;

public class HashSetCollection {


    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>(10);
        arrList.add(1);
        arrList.add(2);
        arrList.add(1);
        arrList.add(2);
        arrList.add(1);

        Set<Integer> set  =  new HashSet<>(arrList);
        System.out.println(set);




        HashSet <Employee>empSet = new HashSet<Employee>();

        Employee firstEmployee = new Employee(011, "Nisaar", "Mumbai Maharashtra", 85);
        Employee sixthEmployee = new Employee(012, "Nisaar", "Mumbai Maharashtra", 85);
        Employee secondEmployee = new Employee(102, "Sharif", "Sherpura Gujarat", 66);
        // Date rohanDOB = new Date(1994,02,23);
        Calendar rohancal = Calendar.getInstance();
        rohancal.set(1993, 02, 22);
        Date rohanDOB = rohancal.getTime();
        Employee thirdEmployee = new Employee(105, "Rohan", "Pune Maharashtra", rohanDOB, 75);


        empSet.add(firstEmployee);
        empSet.add(secondEmployee);
        empSet.add(thirdEmployee);
        System.out.println( empSet.add(sixthEmployee));

        System.out.println(empSet.size());

        empSet.iterator().forEachRemaining(e-> System.out.println(e));

        System.out.println(empSet.toArray().length);

        HashSet <String>  hs = new HashSet<String>();
        hs.add(" ");
        hs.add("i");
        hs.add("am");
        hs.add("a");
        hs.add("Bad");
        hs.add("Boy");
        hs.stream().forEach(e-> System.out.println(e));

        ArrayList <ArrayList<Integer>> al = new ArrayList <ArrayList<Integer>> ();
        al.add(1,arrList);

    }
}
