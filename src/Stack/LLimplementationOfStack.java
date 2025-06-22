package Stack;

import LinkedList.LLbasics;

public class LLimplementationOfStack {
    public static class Node{
        int data; // value
        Node next; // address of next node
        Node(int data) {
            this.data = data;
        }
    }
    public static class LLstack{
        Node head= null;
        int size=0;
        void push(int x){
            Node temp= new Node(x);
            temp.next = head;
            head=temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty!");
                return -1;
            }
            int x= head.data;
            head=head.next;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty!");
                return -1;
            } return head.data;
        }
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.data+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(size==0){
                return true;
            } return false;
        }

    }
}
