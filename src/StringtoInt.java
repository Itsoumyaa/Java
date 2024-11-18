import java.util.*;
public class StringtoInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String s=sc.nextLine();
        int i=0;
        int sign=1;
        int res=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i<s.length() && ((s.charAt(i)=='-') || (s.charAt(i)=='+'))){
            if(s.charAt(i)=='-'){
                sign=-1;
            } i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            res=res*10+digit;
            i++;
        }
        System.out.println(res);
    }
}
