package DetailedCollections;

import java.util.*;

public class LinkedHashSetCollection {

    public static void main(String[] args) {

        LinkedHashSetCollection  lhsc = new LinkedHashSetCollection();
        LinkedHashSet <String>  hs = new LinkedHashSet<String>();
        hs.add(" ");
        hs.add("i");
        hs.add("am");
        hs.add("a");
        hs.add("Bad");
        hs.add("Boy");
        hs.stream().forEach(e-> System.out.println(e));


        LinkedHashSet <Employee>  hsE = new LinkedHashSet<Employee>();

        Employee firstEmployee = new Employee(011, "Nisaar", "Mumbai Maharashtra", 85);
        Employee sixthEmployee = new Employee(011, "Nisaar  ", "Mumbai Maharashtra", 85);
        Employee secondEmployee = new Employee(102, "Sharif", "Sherpura Gujarat", 66);
        Calendar rohancal = Calendar.getInstance();
        rohancal.set(1993,02,22);
        Date rohanDOB = rohancal.getTime();
        Employee thirdEmployee = new Employee(105, "Rohan", "Pune Maharashtra", rohanDOB, 75);
        Calendar razCal = Calendar.getInstance();
        razCal.set(1998,07,16,12,6,34);
        Date razDOB = razCal.getTime();
        Employee fourthEmployee = new Employee(202, "Raziya", "Mumbai Maharashtra", razDOB, 65);

        hsE.add(firstEmployee);
        hsE.add(secondEmployee);
        hsE.add(thirdEmployee);
        hsE.add(fourthEmployee);
        hsE.add(sixthEmployee);
        System.out.println(hsE.size());

    }
}
