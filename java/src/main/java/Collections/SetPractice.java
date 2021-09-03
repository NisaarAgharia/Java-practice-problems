package Collections;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Set");
        set.add("Set");
        set.add("Set1");
        set.add("Set2");
        set.add("Set3");
        set.add("Set3");
        set.add("Set4");
        set.forEach(s-> System.out.println(s));






        height high1 = new height(6,1);
        Human h1 = new Human("Hasnain",18,high1,55.5f);

        height high2 = new height(5,3);
        Human h2 = new Human("Shahida",50,high2,65.3f);

        height high3 = new height(5,5);
        Human h3 = new Human("Raziya",24,high3,60.7f);

        height high4 = new height(6,0);
        Human h4 = new Human("Nisaar",27,high4,75.7f);




        HashSet<Human> hs = new HashSet<Human>();

        hs.add(h1);
        hs.add(h2);
        hs.add(h3);
        hs.add(h4);
        hs.add(h3);
        hs.hashCode();
        hs.forEach(s-> System.out.println(s.hashCode()));


        LinkedHashSet<Human> linHuman = new LinkedHashSet<Human>(hs);
        Set<String> ls = new LinkedHashSet<String>(set);
        ls.add("ls1");
        ls.add("ls1");
        ls.add("ls2");
        ls.add("ls5");
        ls.add("ls4");
        ls.add("ls3");

        System.out.println(ls.size());

        Iterator itr = ls.iterator();

        while (itr.hasNext())
        {

            String current = (String) itr.next();
           // System.out.println("String"+current);

            itr.next();
            itr.remove();
          //  System.out.println(ls.hashCode());
            System.out.println("ITR - "+ls);
        }
        Iterator itr1 = linHuman.iterator();
        while (itr1.hasNext())
        {
            System.out.println(linHuman);
          //  linHuman.remove(itr1.next());
            itr1.next();
          //  itr1.remove();


            //  System.out.println(ls.hashCode());
        }



        Set<String> tree = new TreeSet<String>();
        TreeSet<Human> treeset = new TreeSet<Human>();

        tree.add("ls1");
        tree.add("ls1");
        tree.add("ls2");
        tree.add("ls5");
        tree.add("ls4");
        tree.add("ls3");



        System.out.println(tree);

        treeset.add(h1);
        treeset.add(h4);
        treeset.add(h3);
        treeset.add(h2);
        System.out.println(treeset);


        TreeSet<Integer> treenum = new TreeSet<Integer>();
        treenum.add(35);
        treenum.add(30);
        treenum.add(10);
        treenum.add(20);
        treenum.add(25);
        treenum.add(15);
        treenum.add(40);
        System.out.println("SET "+ treenum);
        System.out.println("Floor 32 "+treenum.floor(32));
        System.out.println("Floor 8 "+treenum.floor(8));
        System.out.println("Floor 56 "+treenum.floor(56));
        System.out.println("Ceiling 32 "+treenum.ceiling(32));
        System.out.println("Ceiling 15 "+treenum.ceiling(15));
        System.out.println("Headset 32 "+treenum.headSet(32));
        System.out.println("HeadSet 25 "+treenum.headSet(25));
        System.out.println("HeadSet 25 "+treenum.headSet(10));
        System.out.println("Higher 30  "+treenum.higher(30));
        System.out.println("TailSet 25 "+treenum.tailSet(25));
        System.out.println("Poll First "+treenum.pollFirst());
        System.out.println("Poll Last  "+treenum.pollLast());
       // System.out.println("Poll Last  "+treenum.);
        //System.out.println("Poll Last  "+treenum.pollLast());
        //System.out.println("Poll Last  "+treenum.pollLast());








    }
}
