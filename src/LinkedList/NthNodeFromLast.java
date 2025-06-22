package LinkedList;

public class NthNodeFromLast {
    public static class Node{
        int data; // value
        Node next; // address of next node
        Node(int data) {
            this.data = data;
        }

    }
    public static Node getlast(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
            if(fast==null){
                System.out.println("ERROR");
            }
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        } return slow;

    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void remove(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
            if(fast==null){
                System.out.println("ERROR");
            }
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        } slow.next=slow.next.next;

    }

    public static void main(String[] args) {
        Node a= new Node(14);
        Node b= new Node(15);
        Node c= new Node(16);
        Node d= new Node(17);
        Node e= new Node(18);
        Node f= new Node(19);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
       Node ans=getlast(a,2);
        System.out.println(ans.data);
        remove(a,2);
        display(a);
    }
}
