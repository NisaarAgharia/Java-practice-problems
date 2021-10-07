package DetailedCollections.queues;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queueCollection {
    public static void main(String[] args) {
        Queue firstQ = new LinkedList();

        firstQ.offer(10);
        firstQ.offer("test");
        firstQ.remove();
        firstQ.size();
        System.out.println(firstQ.getClass());
        System.out.println(firstQ.peek());
        firstQ.poll();

        System.out.println();

        Deque de = new LinkedList();
de.addFirst(45);
de.add(23);
de.peekFirst();

de.addFirst(33);
de.remove(33);
de.addLast(34);
de.removeFirst();
        Iterator itr = de.descendingIterator();
while (itr.hasNext())
{
    System.out.println(itr.next());
}
        System.out.println(de);

    }
}
