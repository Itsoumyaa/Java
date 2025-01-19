import java.util.Scanner;

public class Sum_of_digits {
    static int sod(int n){
        if(n==0){
            return 0;
        }
        int x=n%10;
        int res=sod(n/10)+x;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n: ");
        int n=sc.nextInt();
        System.out.println(sod(n));
    }
}
