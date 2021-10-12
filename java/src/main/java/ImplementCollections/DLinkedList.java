package ImplementCollections;

import javax.imageio.stream.ImageInputStream;
import java.util.List;

public class DLinkedList  {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    //Will Push new_data on Front of LinkedList and make it head
    public void push(int new_data) {
        //Allocate a Node and Put data in it
        Node new_node = new Node(new_data);

        //make new_node -> next -> head
        new_node.next = head;
        new_node.prev = null;
        // change prev of head
        if (head != null) {
            head.prev = new_node;
        }
        //Change the Head to new node
        head = new_node;
    }

    public void insertAfter(Node prev_node, int new_data) {
        //check if prev_node is NULL
        if (prev_node == null) {
            System.out.println("The Previous element node cannot be null");
            return;
        }
        //Allocate Node and put it new data.
        Node new_node = new Node(new_data);
        //change new_node next to prev node next
        new_node.next = prev_node.next;

        //change prev_node next to new node
        prev_node.next = new_node;

        // change
        new_node.prev = prev_node;

        // Change the next nodes previous pointer to new node data
        if (new_node.next != null) {
            new_node.next.prev = new_node;

        }

    }

    public void insertBefore(Node after_node, int new_data) {
        if (after_node == null) {
            System.out.println("After node cannot be null");
            return;
        }

        //Allocate and add new data
        Node new_node = new Node(new_data);

        new_node.next = after_node;
        new_node.prev = after_node.prev;
        after_node.prev = new_node;

        if (new_node.prev != null) {
            new_node.prev.next = new_node;
        } else
            head = new_node;

    }

    void append(int new_data) {
        //add element at the last
        Node new_node = new Node(new_data);
        new_node.next = null;

        Node last = head;

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;

        new_node.prev = last;


    }
    void printList(Node node)
    {
        Node last = null;
        System.out.println("Traversing in the Forward direction");
        while(node!=null)
        {
            System.out.print(node.data+ " ");
            last = node;
            node = node.next ;
        }
        System.out.println(" ");
     //   System.out.println("Traversing in the Backward Direction");
        while(last!=null)
        {
         //   System.out.print(last.data+ " ");
            last = last.prev;
        }


    }

    void deleteNode(Node del){
        //base case
        if(head ==null || del == null)
        {
            return;
        }
        if(head == del){
            head= del.next;
        }

        if (del.next!=null)
        {
            del.next.prev=del.prev;
        }
        if(del.prev!=null)
        {
            del.prev.next = del.next;
        }
        return;
    }

        DLinkedList deleteNodeByKey(DLinkedList list,int key){

        Node currNode = list.head,prev=null;

        //if head of LL is the key
        if (currNode!=null && currNode.data==key)
        {
            if (currNode.next!=null){
                currNode.next.prev = null;
                list.head = currNode.next;
                System.out.println(key + " Found in the head and deleted");
            }
            else
            {
                list.head=null;
            }

            return list;
        }
        //If key is in middle or last element of  LL
            while (currNode!=null && currNode.data!=key){
                prev = currNode;
                currNode=currNode.next;
            }
            if(currNode!=null && currNode.next!=null){
                currNode.prev.next = currNode.next;
                currNode.next.prev=currNode.prev;
                System.out.println(key+ "Found and deleted");
                return list;
            }else{
                prev.next=null;
            }
            //if key is not present
            if(currNode==null){
                System.out.println("Key Not found");
            }
        return list;
        }
    public static void main(String[] args) {

        DLinkedList dll = new DLinkedList();
        dll.push(10);
        dll.append(30);
        dll.push(20);
        dll.insertAfter(dll.head.next.next,44);
        dll.insertBefore(dll.head.next.next,22);
        dll.printList(dll.head);

      //  dll.deleteNode(dll.head);
      //  dll.deleteNode(dll.head.next.next.next);
        dll.printList(dll.head);

        dll.deleteNodeByKey(dll,22);
        dll.deleteNodeByKey(dll,33);
        dll.deleteNodeByKey(dll,44);
        dll.deleteNodeByKey(dll,30);
        dll.deleteNodeByKey(dll,20);
        //dll.deleteNodeByKey(dll,10);
        dll.printList(dll.head);
    }
}
