package LinkedList;

public class LoopDetection2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node detect(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        } if(fast==null || fast.next==null){
            return null;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;


    }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next=new Node(4);
            head.next.next.next.next=new Node(5);
            head.next.next.next.next.next=new Node(7);
            head.next.next.next.next.next.next = head.next.next;
            Node loopStart = detect(head);
            if (loopStart != null) {
                System.out.println("Loop starts at node: " + loopStart.data);
            } else {
                System.out.println("No loop detected.");
            }
        }
}
