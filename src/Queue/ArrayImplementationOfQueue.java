package Queue;

public class ArrayImplementationOfQueue {
    public static class QueueA{
        int f=-1; // front
        int r=-1; // rear
        int[] arr= new int[5];
        int size=0;
        public void add(int x){
            if(r==arr.length-1){
                System.out.println("Queue is full!");
                return;
            }
            if(f==-1){
                f=r=0;
                arr[0]=x;
            }
            else{
                arr[r+1]=x; // these 2 lines can be written as arr[++r]=x;
                r++;
            }
            size++;
        } public int remove(){
            if(size==0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty!");
            } else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueA q= new QueueA();
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
