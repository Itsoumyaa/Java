import java.util.*;

public class QueueInterface {
    static void QueueExamples(){
        LinkedList<Integer> q= new LinkedList<>(); // ll can be used as queue in java
        q.offer(1);
        q.offer(2);
        q.offer(3); // inserting elements in queue
        System.out.println(q.peek()); // 1 returns first element i.e 1
        System.out.println(q.poll()); // removes 1st element
        System.out.println(q.peek()); //2
        System.out.println(q.isEmpty()); // false
        System.out.println(q.size());
        System.out.println(q);
    }
    static void priorityqueue(){
        PriorityQueue<Integer> pq= new PriorityQueue<>(); // min pq
        PriorityQueue<Integer> pqmax= new PriorityQueue<>(Comparator.reverseOrder()); // max pq i.e. highest number highest priority
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); // 5 bcoz sabse chote ki sabse pehele processing hoti h kyoki pq by default min pq hota h
        // the smallest element has the highest priority
        System.out.println(pq); // there's no order guarantee its just topmost priority element will be processed
        System.out.println(pq.poll());
        System.out.println(pq.peek()); // 7
        System.out.println(pq); // basically isme first element woh hota h jiski hoghest priority hoti h baaki uske alawaa saare number kisi bhi order mei aa skte h

    }
    static void dequeueexamples(){
        Deque<Integer> dq= new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); // 2 1 3 4 isme 2 1 ke baad add first kiya toh 2 1 se pehele aa jaaega
        System.out.println(dq.pollFirst());// 2 ko remove kr dega
        System.out.println(dq.pollLast());// 4 ko remove kr dega
        System.out.println(dq);


    }

    public static void main(String[] args) {
        dequeueexamples();
    }
}
