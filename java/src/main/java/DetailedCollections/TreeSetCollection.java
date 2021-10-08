package DetailedCollections;

import java.util.Calendar;
import java.util.Date;
import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {
        TreeSet <Employee>ts = new TreeSet<Employee>();

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
ts.add(firstEmployee);
ts.add(secondEmployee);
ts.add(thirdEmployee);
ts.add(fourthEmployee);
ts.add(sixthEmployee);
        System.out.println(ts);
        ts.stream().forEach(e-> System.out.println(e));

        TreeSet<Employee> dobTS = new TreeSet<Employee>(new EmpComparator());
        dobTS.add(thirdEmployee);
        dobTS.add(fourthEmployee);
        System.out.println(" - ");
        dobTS.stream().forEach(e-> System.out.println(e));

        System.out.println("--");
        System.out.println(ts.headSet(thirdEmployee));
        System.out.println("-4-");
        System.out.println(ts.tailSet(thirdEmployee));
ts.pollLast();



    }



   // Employee thirdEmployee = new Employee(105, "Rohan", "Pune Maharashtra", rohanDOB, 75);
}
