package DetailedCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapCollection {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
map.put(1,"One");
map.put(2,"Two");

        Set s = map.entrySet();
        System.out.println(s);
        for(Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }

        while(!map.isEmpty())
        {
            map.remove(1);
            map.replace(2,"three");
            map.remove(2);

        }
        System.out.println(map);

    }
}
