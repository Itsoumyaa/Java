package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Basic {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>(); // to initialze a queue we dont use "new queue".In java its either linked list or ArrayDeque;
        //Queue<Integer> q1= new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        System.out.println(q.size());
        q.remove();
        System.out.println(q);
        q.poll(); // its like pop. poll and remove are the same
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element()); // peek and element returns the top both are same
        System.out.println(q.isEmpty());
    }
}
