package Stack;

import java.util.Stack;

public class basicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(5);
        st.push(10);
        st.push(12);
        // peek returns topmost value of stack
        System.out.println(st.peek()); // 12
        System.out.println(st);
        st.pop(); // removes top element
        System.out.println(st);
        System.out.println("size is: " + st.size());
    }
}
