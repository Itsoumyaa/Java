package Stack;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        String str="-9/*+5346";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            } else{
                int v1=st.pop(); // iss baar top waali v1 h cuz loop ulta chal rha
                int v2=st.pop();
                if(ch=='+') st.push(v1+v2);
                if(ch=='-') st.push(v1-v2);
                if(ch=='*') st.push(v1*v2);
                if(ch=='/') st.push(v1/v2);
            }
        }
        System.out.println(st.peek());
    }
}
