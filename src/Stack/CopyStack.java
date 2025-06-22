package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        System.out.println("Enter n: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=1;i<=n;i++){
            int x= sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer> rt= new Stack<>();
        while(st.size()>0){
            //int y= st.peek();
            rt.push(st.pop()); // when pop removes the value it also has the value that it removes
            //st.pop();
        }System.out.println(rt);
        Stack<Integer> gt= new Stack<>();
        while(rt.size()>0){
            //int y= st.peek();
            gt.push(rt.pop()); // when pop removes the value it also has the value that it removes
            //st.pop();
        }System.out.println(gt);
    }
}
