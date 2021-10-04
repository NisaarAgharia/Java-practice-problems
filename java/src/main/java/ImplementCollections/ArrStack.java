package ImplementCollections;

import java.util.Arrays;

public class ArrStack {
int[] stack;
int cap;
int top;
    public ArrStack(int c) {
        cap=c;
        top = -1;
        stack = new int[cap];
    }

    public void push(int x){
        if(top ==cap-1){
            System.out.println("Stack is full");
        }
        top++;
        stack[top] = x;

}
public int pop(){
        if(top==-1){
            throw new RuntimeException("TRYING TO POP EMPTY STACK");
        }
        int res = stack[top];
        top--;
    return res;
}
public int peek() throws Exception {
    if(top==-1){
        throw new Exception("TRYING TO PEEK EMPTY STACK");
    }
    return stack[top];
}
public int size(){
    return top+1 ;
}
boolean isEmpty(){
    return top==-1;
}

    @Override
    public String toString() {
        return "ArrStack{" +
                "stack=" + Arrays.toString(stack) +
                ", cap=" + cap +
                ", top=" + top +
                '}';
    }

    public static void main(String[] args) throws Exception {
ArrStack arr = new ArrStack(10);
//arr.pop();
        arr.push(10);
        arr.push(20);
        arr.push(30);
        System.out.println( arr.peek());
        arr.pop();
        arr.push(40);
        System.out.println(arr);

    }
}
