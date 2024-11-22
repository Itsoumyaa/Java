import java.util.*;
public class Division{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number 1: ");
        int n1=sc.nextInt();
        System.out.println("enter number 2: ");
        int n2=sc.nextInt();
        try{
            int res=n1/n2;
            System.out.println(res);
        }
        catch(ArithmeticException | InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("Division by zero not possible");
        }
    }
}
