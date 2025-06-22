package LinkedList;

public class LLbasics {
    public static class Node{
        int data; // value
        Node next; // address of next node
        Node(int data) {
            this.data = data;
        }
    }
    public static void normaldisplay(Node head){
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
    public static void recursivedisplay(Node head){
        if(head==null) return;
        System.out.println(head.data+" ");
        recursivedisplay(head.next);
    }
    public static void reverserecursivedisplay(Node head){
        if(head==null) return;
        reverserecursivedisplay(head.next);
        System.out.println(head.data+" ");
    }
    public static void main(String[] args) {
        Node a= new Node(5);
        Node b= new Node(6);
        Node c= new Node(7);
        a.next=b; // now we linked a to b
        b.next=c;
        normaldisplay(a);
        System.out.println();
        recursivedisplay(a);
        System.out.println();
        reverserecursivedisplay(a);
        //System.out.println(a.next.data); // this will print 6
        //System.out.println(a.next); // this will print the address of B i.e. LinkedList.LLbasics$Node@7b23ec81
    }
}
