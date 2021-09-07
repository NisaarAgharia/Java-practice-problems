package Collections;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        Map<String,Human> hm = new HashMap<String,Human>();

        height high1 = new height(6,1);
        Human h1 = new Human("Hasnain",18,high1,55.5f);

        height high2 = new height(5,3);
        Human h2 = new Human("Shahida",50,high2,65.3f);

        height high3 = new height(5,5);
        Human h3 = new Human("Raziya",24,high3,60.7f);

        height high4 = new height(6,0);
        Human h4 = new Human("Nisaar",27,high4,75.7f);

        hm.put("Hasnain",h1);
        hm.put("Shahida",h2);
        hm.put("Raziya",h3);
        hm.put("Nisaar",h4);
        hm.put("Hasnain",h1);
       // hm.put("Nisaar",h3);


        for (Map.Entry<String, Human> entry: hm.entrySet())
        {
            System.out.println("Key - " + entry.getKey());
            System.out.println("Value - "+ entry.getValue());
        }
      //  System.out.println(hm);



        Map<String,height> height = new HashMap<String,height>();
        height.put("Hasnain",high1);
        height.put("Shahida",high2);
        height.put("Raziya",high3);
        height.put("Nisaar",high4);

        System.out.println(height);

        Map<String,Integer> alpha = new HashMap<String,Integer>();
        alpha.put("A",1);
        alpha.put("f",2);
        alpha.put("C",3);
        alpha.put("l",4);
        alpha.put("n",4);
        alpha.put("r",5);
        alpha.put("z",6);
        alpha.put("Z",7);

        for (String s:alpha.keySet())
        {
            System.out.println(s);
        }

        for (Integer s:alpha.values())
        {
            System.out.println(s);
        }

        Iterator<Integer> itr = alpha.values().iterator();
        while(itr.hasNext())
        {
            if (itr.next()==4)
            {
                itr.remove();
            }
        }
     alpha.forEach((s,k)-> System.out.println("Remaining values - "+s));




        Iterator <Human> HMitr =  hm.values().iterator();
        System.out.println("Human prev" + hm.size());
        while (HMitr.hasNext())
        {
           if( HMitr.next().age==27)
           {
               HMitr.remove();
           }
        }
        System.out.println("Human" + hm.size());


        TreeMap<String,Integer> hei = new TreeMap<String,Integer>(alpha);
        System.out.println(hei.floorEntry("p"));
        System.out.println(hei.descendingKeySet());
        System.out.println(hei.descendingMap());
        System.out.println(hei.pollLastEntry());

    }

}
