package LinkedList;

public class MiddleNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static int middle(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        } temp=head;
        for(int i=size/2+1;i<size;i++){
            temp=temp.next;
        } return temp.data;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next=new Node(4);
        //head.next.next.next.next=new Node(5);
        //head.next.next.next.next.next=new Node(6);
        System.out.println(middle(head));
    }
}
