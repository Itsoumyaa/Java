import java.util.*;
public class ValidAge {
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        if(age<18){
            throw new InputMismatchException();
        }
        System.out.println("Valid age");
    }
}
