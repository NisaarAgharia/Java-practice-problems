package DetailedCollections;

import java.util.*;

public class ListCollection {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add(3,"Fourth");
        System.out.println(list.hashCode());
        list.add("Fifth");
        System.out.println("");
       /// list.listIterator().remove();
        System.out.println(list.indexOf("Third"));
        System.out.println(list.subList(0,2));
        list.set(1,"Sixth");
        System.out.println(list.toString());
        ListIterator itr = list.listIterator();

        while(itr.hasNext()){
            System.out.println(" - "+itr.next());
        }
        while(itr.hasPrevious()){
            System.out.println(" - "+itr.previous());
        }
        String[] arr = list.toArray(new String[list.size()]);
      //  String[] arr2 = (String[]) list.toArray();
        String[] array= {"java","python","php"};
        array.toString();
        Collections.sort(list);
        System.out.println(list);
     //   System.out.println("arr2"+arr2.length);
        String concat= "";
        for (String numbers : list)
        {
            concat += numbers;

        }

        System.out.println(concat);
        List <Integer> intList = new LinkedList<Integer>();

        List<Employee> empList =  new ArrayList<Employee>();


    }
}
