package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseKelementsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
//        q.add(6);
//        q.add(7);
        Stack<Integer> st= new Stack<>();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter k: ");
        int k=sc.nextInt();
        for(int i=1;i<=k;i++){
            st.add(q.poll());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=1;i<=q.size()-k;i++){
            q.add(q.poll());
        }
        System.out.println(q);

    }
}
