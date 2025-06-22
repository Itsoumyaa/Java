package Stack;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        Stack<String> st= new Stack<>();
        String str="-9/*+5346";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String s=""+ch;
                st.push(s);
            }else{
                String v1=st.pop();
                String v2=st.pop();
                String t= v1+v2;
                st.push(t+ch);
            }
        }
        System.out.println(st.pop());
    }
}
