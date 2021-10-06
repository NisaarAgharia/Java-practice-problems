package DSA;

import java.util.Stack;

public class StackParenthesisMatching {

    boolean isParenthesisMatching(String str){
        Stack<Character> s = new Stack<Character>();

        char[] charstr = str.toCharArray();
        for (char c: charstr)
        {
            if(isopening(c)){
                s.push(c);
            }
            else if (s.empty()){
                return false;
            }
            else if (!isMatching(s.peek(),c)){
                return false;
            }
            else {
                s.pop();
            }
        }

        return s.isEmpty();
    }

    private boolean isMatching(Character peek, char c) {
        return ( peek=='(' && c==')') || (peek == '{'&& c == '}') || (peek == '[' && c ==']');
    }

    private boolean isopening(char c) {
      //  boolean val = (c=='{' || c=='(' || c=='[');
      return c=='{' || c=='(' || c=='[';

    }


    public static void main(String[] args) {

        String expr = "([{}]))";
        StackParenthesisMatching pm = new StackParenthesisMatching();

        if(pm.isParenthesisMatching(expr)){
            System.out.println("Parenthesis matched");
        }
        else{
            System.out.println("Did not match");
        }

    }
}
