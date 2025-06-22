import java.util.Scanner;

public class HWIEasyQues {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements of the array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter q");
        int q=sc.nextInt();
        for(int qi=0;qi<q;qi++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int i=l;i<=r;i++){
                long val=(x+1L*(i-l)*y)%MOD;
                arr[i]=(int)val;
            }
        }
        long sum=0;
        for(int val:arr){
            sum=(sum+val)%MOD;
        }
        System.out.println(sum);

    }
}
