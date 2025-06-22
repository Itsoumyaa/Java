package Stack;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        Stack<String> st= new Stack<>();
        String str="953+4*6/-";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String s=""+ch;
                st.push(s);
            }else{
                String v2=st.pop();
                String v1=st.pop();
                st.push(v1 + ch + v2);
            }
        }
        System.out.println(st.peek());
    }
}
