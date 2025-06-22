package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st= new Stack<>();
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=1;i<=n;i++){
            int x= sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        System.out.println("Enter element to insert and index: ");
        int a= sc.nextInt();
        int idx=sc.nextInt();
        Stack<Integer> rt= new Stack<>();
        while(st.size()>idx-1){
           rt.push(st.pop());
        }
        st.push(a);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);


    }
}
