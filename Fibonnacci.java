import java.util.Scanner;

public class Fibonnacci {
    static void fib(int n) {
        int t1 = 0;
        int t2 = 1;
        int next;
        for (int i = 1; i <= n; i++) {
            System.out.println(t1);
            next = t1 + t2;
            t1 = t2;
            t2 = next;

        } return;
    }

    public static void main(String[] args) {
        int num=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter n: ");
        String n=in.nextLine();
        float val=Float.parseFloat(n);
        char v=n.charAt(0);
        num=Character.getNumericValue(v);
        //num=(int) v;
        num=(int) val;
        fib(num);
        }
    }

