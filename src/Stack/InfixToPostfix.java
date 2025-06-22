package Stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String str="9-(5+3)*4/6"; //postfix: 953+4*6/-
        Stack<String> val= new Stack<>();
        Stack<Character> op= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            //0->48 and 9->57 ascii values from 0 to 9 is 48 to 57
            if(ascii>=48 && ascii<=57){
                String s=""+ch;
                val.push(s);//  for eg: for 7 u need to do 55-48 then only u get 7 kyoki if u just push acii value then 55 push hoga which is not in the string
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            } else if(ch==')'){
                while(op.peek()!='('){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o= op.pop();
                    String t=v1+v2+o;
                    val.push(t);
                }
                op.pop();
            }
            else{
                if(ch=='+'|| ch=='-'){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o= op.pop();
                    String t=v1+v2+o;
                    val.push(t);
                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String v2=val.pop();
                        String v1=val.pop();
                        char o= op.pop();
                        String t=v1+v2+o;
                        val.push(t);
                        op.push(ch);
                    } else{
                        op.push(ch);
                    }
                }
            }
        } while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char o= op.pop();
            String t=v1+v2+o;
            val.push(t);

        }
        String prefix=val.pop();
        System.out.println(prefix);
    }
}
