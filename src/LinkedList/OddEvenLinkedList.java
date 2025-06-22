package LinkedList;

public class OddEvenLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node[] EvenOdd(Node head){
        Node even= new Node(0);
        Node odd= new Node(0);
        Node e= even;
        Node o= odd;
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                e.next=temp;
                e=e.next;
            } else{
                o.next=temp;
                o=o.next;
            }
            temp=temp.next;
        } e.next=null;
        o.next=null;
        return new Node[]{even.next,odd.next};
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        System.out.println("Original List:");
        printList(head);

        Node[] result = EvenOdd(head);
        Node evenList = result[0];
        Node oddList = result[1];

        System.out.println("Even List:");
        printList(evenList);

        System.out.println("Odd List:");
        printList(oddList);
    }
}
