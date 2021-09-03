package Collections;

import java.util.*;

public class ArrayListCode {
    List<String> players = new ArrayList<String>();
    public static void main(String[] args) {
        List<String> players = new ArrayList<String>();

        List<Integer> integer = new ArrayList<Integer>();

        players.add("Sachin");
        players.add("Dravid");
        players.add("dravi");
        players.add("dravi");
        players.add("Ganguly");
        players.add("Pointing");
        players.add("dravi");
        players.add(3,"lara");

        System.out.println(players.size());
        System.out.println(players.indexOf("dravi"));
        System.out.println(players.lastIndexOf("dravi"));
        Iterator <String> arrlist = players.iterator();

        while(arrlist.hasNext())
        {

            String str = arrlist.next();
            System.out.println(str);
           // arrlist.remove();
           // System.out.println(str);

        }
        System.out.println(players.size());
        System.out.println(players.contains("Sachin"));

        Collections.sort(players,new ListComparator());
        players.stream().filter(s->s.contains("a")).forEach(s-> System.out.println(s));
        integer.add(9);
        integer.add(10);
        integer.add(6);
        integer.add(3);
        integer.add(8);


        height high1 = new height(6,1);
        Human h1 = new Human("Hasnain",18,high1,55.5f);

        height high2 = new height(5,3);
        Human h2 = new Human("Shahida",50,high2,65.3f);

        height high3 = new height(5,5);
        Human h3 = new Human("Raziya",24,high3,60.7f);

        height high4 = new height(6,0);
        Human h4 = new Human("Nisaar",27,high4,75.7f);


        List <Human> famList = new ArrayList<Human>();
        famList.add(h1);
        famList.add(h2);
        famList.add(h3);
        famList.add(h4);


       // famList.remove(h3);
        Iterator <Human> itr = famList.listIterator();
        while (itr.hasNext())
        {
//famList.add(h4);
            Human itrHuman = itr.next();
            System.out.println(itrHuman);
        }
        System.out.println("Using Compartor");
Collections.sort(famList,new HumanComparator());
        //System.out.println(famList);
famList.forEach(s-> System.out.println(s));
        System.out.println(famList.indexOf(h3));

        Human[] humArray = new Human[5];
      famList.toArray();
        System.out.println(Arrays.toString(famList.toArray()));


    }
}
