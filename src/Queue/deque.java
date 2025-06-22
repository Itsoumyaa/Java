package Queue;


import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq= new LinkedList<>();
        dq.addLast(1); // insertion from last
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addFirst(5); // insertion from left
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println(dq.getFirst()); // gives peek from left
        System.out.println(dq.getLast()); // peek from right
    }
}
