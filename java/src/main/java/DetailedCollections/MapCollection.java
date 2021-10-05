package DetailedCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCollection {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<Integer, String>();

        map.put(1,"Once");
        map.put(2,"Twice");
        map.put(3,"Thrice");
        map.put(4,"Fourth");

        System.out.println(map.get(3));

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());

        map.replace(3,"Fifth");

        System.out.println(map.entrySet());

        Set set  = map.entrySet();
        Iterator mapITR = set.iterator();
        while (mapITR.hasNext()){
            Map.Entry me = (Map.Entry) mapITR.next();
            System.out.println(me.getKey());
            System.out.println(me.getValue());

        }


    }
}
