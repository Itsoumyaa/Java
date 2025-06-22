package LinkedList;

public class ImplementationLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtstart(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;

            } size++;
        }
        void insertAtend(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }size++;
        }
        void insertAtK(int k, int val) {
            if(k==size()){
                insertAtend(val);
                return;
            }
            if(k<0 || k>size()){
                System.out.println("WRONG INDEX");
                return;
            }
            Node t= new Node(val);
            Node temp=head;
            for(int i=1;i<=k-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;

        }
        int size(){
           return size;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void delete(int idx){
            Node temp=head;
            if (idx < 0 || idx >= size) {
                System.out.println("WRONG INDEX");
                return;
            }
            if(idx==0){
                head=head.next;
                if(head==null){
                    tail=null;
                }
                size--;
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            if(temp.next==tail){
                tail=temp;
            }temp.next=temp.next.next;
            size--;
        }
    }

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.insertAtstart(4);
        ll.insertAtstart(5);
        ll.insertAtend(6);
        ll.insertAtK(2,7);
        ll.display();
        ll.delete(3);
        System.out.println();
       System.out.println(ll.tail.data);
       ll.display();
    }
}
