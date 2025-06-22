package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> st){
        if (st.isEmpty()) {
            return;
        }
        int top= st.pop();
        reverse(st);
        pushAtBottom(top,st);
    }
    public static void pushAtBottom(int x, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top= st.pop();
        pushAtBottom(x,st);
        st.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
