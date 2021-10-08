package ImplementCollections;

class Node{
    int data;
    Node next;
    public Node(int d) {
        data = d;
        next = null;
    }
}

public class StackLL {
    Node head;
    int size;
    StackLL(){
        head=null;
        size=0;
    }

    void push(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
         size++;
    }

   public int pop(){
        if (head==null){
            throw new RuntimeException("Head Is Null");
        }
        Node res = head;
        head = head.next;
        size--;
        return res.data;
    }


    public int peek() throws Exception {
        if(head==null){
            throw new Exception("HEAD IS NULL");
        }
        return head.data;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return head==null;
    }

    public static void main(String[] args) throws Exception {
    StackLL lls = new StackLL();

    lls.push(10);
        lls.push(20);

        System.out.println( lls.size());
        System.out.println(lls.peek());


        System.out.println(lls.pop());
        System.out.println(lls.isEmpty());

    }
}
