import java.util.Scanner;

public class GCD {
    static int gcd(int x,int y){
//        while(a%b!=0){
//            int rem=a%b;
//            a=b;
//            b=rem;
//        } return b;
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x: ");
        int x= sc.nextInt();
        System.out.println("enter y: ");
        int y= sc.nextInt();
        System.out.println(gcd(x,y));
    }
}
