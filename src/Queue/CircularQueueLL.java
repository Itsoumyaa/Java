package Queue;

public class CircularQueueLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class cqll{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node temp= new Node(x);
            if(size==0){
                head=tail=temp;
            } else{
                tail.next=temp;
                tail=temp;
                tail.next=head;
            } size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x=head.val;
            if(size==1){
                head=tail=null;
            } else {
                head = head.next;
                tail.next = head;
            }
            size--;
            return x;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.val;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty!");
                return;
            }
            Node temp=head;
            do {
                System.out.print(temp.val + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        cqll q= new cqll();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
