package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Pop {
//    public static void display(Stack<Integer> st){
//        if(st.size()==0) return;
//        int top=st.pop();
//        System.out.println(top+ " ");
//        display(st);
//        st.push(top);
//
//    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of the stack: ");
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Entered stack: ");
        //display(st);
        System.out.println(st);
        Stack<Integer> rt= new Stack<>();
        System.out.println("enter index to pop (from bottom)");
        int idx= sc.nextInt();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);

    }
}
