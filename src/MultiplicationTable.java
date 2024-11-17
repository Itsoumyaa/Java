import java.util.*;
public class MultiplicationTable {
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n: ");
        int n= sc.nextInt();
        System.out.println("Table of"+n);
        table(n);
        System.out.println("enter m: ");
        int m=sc.nextInt();
        System.out.println("Table of"+m);
        table(m);
    }
}
