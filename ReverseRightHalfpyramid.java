import java.util.Scanner;
public class ReverseRightHalfpyramid {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter n:  ");
        int n = in.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
