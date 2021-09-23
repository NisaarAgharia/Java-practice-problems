package DetailedCollections;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>(10);
        ArrayList<Employee> empArrList = new ArrayList<Employee>();

        //adding elements into the array list
        arrList.add(9);
        arrList.add(81);
        arrList.add(144);
        arrList.add(4);
        arrList.add(3, 64);
        Collections.sort(arrList);
        ListIterator itrList = arrList.listIterator();

        while (itrList.hasNext()) {

            System.out.println(itrList.next());
        }

        Employee firstEmployee = new Employee(011, "Nisaar", "Mumbai Maharashtra", 85);
        Employee sixthEmployee = new Employee(011, "Nisaar", "Mumbai Maharashtra", 85);
        Employee secondEmployee = new Employee(102, "Sharif", "Sherpura Gujarat", 66);
        // Date rohanDOB = new Date(1994,02,23);
        Calendar rohancal = Calendar.getInstance();
        rohancal.set(1993, 02, 22);
        Date rohanDOB = rohancal.getTime();
        Employee thirdEmployee = new Employee(105, "Rohan", "Pune Maharashtra", rohanDOB, 75);
        //   empArrList.add(0,);

        Calendar razCal = Calendar.getInstance();
        razCal.set(1998, 07, 16, 12, 6, 34);
        Date razDOB = razCal.getTime();

        Employee fourthEmployee = new Employee(202, "Raziya", "Mumbai Maharashtra", razDOB, 65);
        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(firstEmployee);
        empList.add(secondEmployee);
        empList.add(thirdEmployee);
        empList.add(fourthEmployee);
        empList.add(sixthEmployee);

        for (Employee emp : empList) {
            // System.out.println(emp);
        }
        ListIterator<Employee> empitr = empList.listIterator();

        while (empitr.hasNext()) {
            if (empitr.next().getWeight() == 65) {
                empitr.remove();

            }
        }

        //   System.out.println(empList.peek());
        //   System.out.println(empList);
        String filename = "arrList.ser";
        SerializeDeserialize serDes = new SerializeDeserialize(filename, empList);
        serDes.serialize();
        serDes.deSerialize();

        System.out.println(empList.stream().filter(e->e.getEmpID()==011).distinct().count());
      //  empList.stream().filter(e->e.getWeight()>60).collect();
//arrList.retainAll(empList);
        System.out.println(empList);

        // Some removal methods
        arrList.remove(2);
        empList.remove(1);
        Calendar remCal = Calendar.getInstance();
        remCal.set(1994,01,01,01,01,01);
        Date remove = remCal.getTime();
               // empList.removeIf(e->e.getEmpDOB().before(remove));
        System.out.println(empList);


        Collections.sort(empList,new EmpComparator());
        System.out.println(empList);
        Collections.reverse(empList);

        List<Employee> UnModifiedList = Collections.unmodifiableList(empList);
        List<Employee> SynchedList = Collections.synchronizedList(empList);

    }



}
