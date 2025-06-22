package Queue;

public class CircularQueueArray {
    public static class cqa{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr= new int[5];
        public void add(int x) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is full!");
            } else if(size==0){
                f=r=0;
                arr[0]=x;
            }
            else if(r< arr.length-1){
                arr[++r]=x;
            }
            else if(r==arr.length-1){
                r=0;
                arr[0]=x;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty!");
            }
            else{
                int x=arr[f];
                if(f==arr.length-1) f=0;
                else f++;
                size--;
                return x;
            }
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty!");
            } else{
                return arr[f];
            }
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty!");
                return;
            } else if(f<=r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            } else{
                for(int i=f;i<=arr.length-1;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
       cqa q= new cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        q.add(5);
        q.display();
        q.add(6);
        q.display(); // it will normally display the queue cuz we coded it that way so it shows the elements in the order it was inserted
        System.out.println(q.peek());
        for(int i=0;i<q.arr.length;i++){
            System.out.print(q.arr[i]+" "); // it will show how actually circular queue isnlooking through an array. It will show the circular nature
        }
    }
}
