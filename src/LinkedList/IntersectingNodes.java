package LinkedList;

public class IntersectingNodes {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node getIntersectionNode(Node a, Node b){ // headA=a ;  headB=b;
            int n1=size(a);
            int n2=size(b);
            int n3=0;
            Node temp1=a;
            Node temp2=b;
            if(n1>n2){
                n3=n1-n2;
                for(int i=0;i<n3;i++){
                    temp1=temp1.next;
                }
            } else{
                n3=n2-n1;
                for(int i=0;i<n3;i++){
                    temp2=temp2.next;
                }
            }
            while(temp1 != temp2){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            return temp1;

        }
        public static int size(Node head){
            Node temp=head;
            int count=0;
            if(temp==null){
                return 0;
            }
            while(temp!=null){
                count++;
                temp=temp.next;
            } return count;
        }


    public static void main(String[] args) {
        // Creating shared intersection node
        Node intersectNode = new Node(4);
        intersectNode.next = new Node(10);
        intersectNode.next.next = new Node(12);

        // First linked list: 1 -> 2 -> 3 -> [8 -> 10]
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = intersectNode;

        // Second linked list: 5 -> [8 -> 10]
        Node headB = new Node(5);
        headB.next = intersectNode;

        // Find and print the intersection node
        Node intersection = getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
