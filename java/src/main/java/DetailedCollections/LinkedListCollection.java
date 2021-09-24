package DetailedCollections;

import java.util.*;

public class LinkedListCollection {

    public static void main(String[] args) {

        LinkedList<String> llString = new LinkedList<String>();
        LinkedList<Employee> llEmployee = new LinkedList<Employee>();

        llString.addFirst("Last");
        llString.addLast("First");
        llString.add("Second");
        llString.push("Third");

        llString.addFirst("Zeroth");
        llString.addLast("Lastest");
        llString.pop();
        System.out.println(llString.peek());
        llString.offerFirst("Aryabhatta");
        llString.offer("empty");
        System.out.println(llString);
        System.out.println(llString.peek());
        System.out.println(llString.pop());
        System.out.println(llString.poll());
        System.out.println(llString);
        Iterator i = llString.descendingIterator();
        while (i.hasNext())
            System.out.println(i.next());


    Employee firstEmployee = new Employee(011, "Nisaar", "Mumbai Maharashtra", 85);
    Employee sixthEmployee = new Employee(011, "Nisaar", "Mumbai Maharashtra", 85);
    Employee secondEmployee = new Employee(102, "Sharif", "Sherpura Gujarat", 66);
    Calendar rohancal = Calendar.getInstance();
        rohancal.set(1993,02,22);
    Date rohanDOB = rohancal.getTime();
    Employee thirdEmployee = new Employee(105, "Rohan", "Pune Maharashtra", rohanDOB, 75);
    Calendar razCal = Calendar.getInstance();
        razCal.set(1998,07,16,12,6,34);
    Date razDOB = razCal.getTime();
    Employee fourthEmployee = new Employee(202, "Raziya", "Mumbai Maharashtra", razDOB, 65);

        llEmployee.add(firstEmployee);
        llEmployee.add(secondEmployee);
        llEmployee.push(thirdEmployee);
        llEmployee.push(fourthEmployee);

llEmployee.forEach(e-> System.out.println(e));
llEmployee.pop();
        System.out.println("------"+llEmployee.peek());
        llEmployee.forEach(e-> System.out.println(e));

}
}
