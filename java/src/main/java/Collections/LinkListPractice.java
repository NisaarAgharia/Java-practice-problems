package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkListPractice {

    public static void main(String[] args) {

        LinkedList <String> linked = new LinkedList<String>();

        linked.add("Hello");
        linked.addFirst("add first");
        linked.addLast("add Last");
        System.out.println(linked);
       //linked.forEach(s-> System.out.println(s));

        linked.offer("Mai Last");
        linked.offerFirst("Mai First");

        linked.pop();
        String currHead = linked.poll();
        System.out.println("Headd " + currHead);
        linked.push("Hello");
        linked.push("Hello2");
        linked.push("Hello3");
        System.out.println("Peeking "+linked.peek());
        System.out.println("Poking "+linked.size());
//        for (String l :linked)
//        {
//            if (l.equals("Mai Last"))
//            {
//                linked.poll();
//
//            }
//            if (l.contains("Hello"))
//            {
//                linked.pop();
//
//            }}


        while (linked.peek().contains("Hello"))
        {
            linked.pop();
        }
        System.out.println(linked);


      //  CopyOnWriteArrayList <String> Clonelinked = (CopyOnWriteArrayList<String>) linked.clone();
        CopyOnWriteArrayList <String> Clonelinked = new CopyOnWriteArrayList<>(List.copyOf(linked));
        Clonelinked.addAll(linked);
        for (String cl :Clonelinked)
        {
            if (cl.equals("Hello"))
            {
                Clonelinked.remove("Hello");

            }
        }
        Clonelinked.remove(1);
        Clonelinked.add(1,"Namo Namo");
        System.out.println("CloneLinked");
        System.out.println(Clonelinked);
        System.out.println(Clonelinked.contains("Namo"));

        System.out.println(Clonelinked);
    }
}
