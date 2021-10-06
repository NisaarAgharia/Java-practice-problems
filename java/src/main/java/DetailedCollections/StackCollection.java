package DetailedCollections;

import java.lang.reflect.Array;
import java.util.*;

public class StackCollection {
    public static void main(String[] args) {
        Stack<String> st= new Stack<String>();
        st.push("a");
        st.push("b");
        st.peek();
        System.out.println( st.toString());
StringBuilder sb = new StringBuilder();
sb.append("a");
st.isEmpty();


        char open='(' ;
boolean va2 = (open =='[' || open == '{' || open== '(');

char top = '{';
char val = ')';

boolean test= (top=='[' && val==']' || top=='{' && val=='}' || top=='(' && val==')');

String str = "";
//str.char('a');


        Deque <Integer> stack = new ArrayDeque<Integer>();
        stack.add(10);
        stack.offerFirst(20);
        stack.offerFirst(30);
        stack.pollFirst();
        System.out.println(stack);

        Deque <Integer> stack2 = new LinkedList<Integer>();
        stack2.add(22);
        stack2.offerLast(30);
        System.out.println(stack2);

    }
}
