package LinkedList;

public class LoopDetection {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static boolean detect(Node head){
        Node temp=head;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
            if(temp.next==head){
                return true;
            }
        } return false;


    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(7);
        head.next.next.next.next.next.next=new Node(8);
        head.next.next.next.next.next.next.next=head;
        System.out.println(detect(head));
    }
}
