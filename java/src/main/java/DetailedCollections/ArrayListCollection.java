package DetailedCollections;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList <Integer> arrList = new ArrayList<Integer>();
        ArrayList<Employee> empArrList = new ArrayList<Employee>();

        //adding elements into the array list
        arrList.add(9);
        arrList.add(81);
        arrList.add(144);
        arrList.add(4);
        arrList.add(5,64);

        Employee firstEmployee = new Employee(011,"Nisaar","Mumbai Maharashtra",85);
        Employee secondEmployee = new Employee(102,"Sharif","Sherpura Gujarat",65);
       // Date rohanDOB = new Date(1994,02,23);
        Calendar cal = Calendar.getInstance();
        cal.set(1993,02,22);
        Date rohanDOB = cal.getTime();
        Employee thirdEmployee = new Employee(105,"Rohan","Pune Maharashtra",rohanDOB,75);
     //   empArrList.add(0,);

    }

}
