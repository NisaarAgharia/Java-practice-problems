package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
        hm.put("Nisaar",h3);

        System.out.println(hm);



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
        alpha.put("r",5);
        alpha.put("z",6);
        alpha.put("Z",7);

        TreeMap<String,Integer> hei = new TreeMap<String,Integer>(alpha);
        System.out.println(hei.floorEntry("p"));
        System.out.println(hei.descendingKeySet());
        System.out.println(hei.descendingMap());
        System.out.println(hei.pollLastEntry());

    }

}
