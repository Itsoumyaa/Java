package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    // q=[1 2 3 4 5 6 7 8] always even given hogi.
    // output= [1 5 2 6 3 7 4 8] like 1st half and 2nd half ke corresponding elements ko saath rkhna h.
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        for(int i=1;i<=8;i++){
            q.add(i);
        }
        int n=q.size();
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n/2;i++){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=0;i<n/2;i++){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.poll());
        }
        while(q.size()!=0){
            st.push(q.poll());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }

}
