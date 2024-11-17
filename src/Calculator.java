import java.util.*;
public class Calculator {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b: ");
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("enter operator (+,-,*,/): ");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+'-> System.out.println(a+b); 
            case '-'-> System.out.println(a-b);
            case'*'-> System.out.println(a*b);
            case '/'-> System.out.println(a/b);
            default-> System.out.println("invalid operator");
        }

    }
}