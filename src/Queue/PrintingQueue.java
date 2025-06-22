package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

//Q. Print the elements of the queue using add(), remove(), peek() and extra queue.
public class PrintingQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new ArrayDeque<>();
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        Queue<Integer> helper= new ArrayDeque<>();
        while(q.size()>0){
            System.out.println(q.peek());
            helper.add(q.poll());
        }
        while(helper.size()>0){
            q.add(helper.poll());
        }
    }
}
