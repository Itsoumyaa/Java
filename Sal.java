import java.util.Scanner;

public class Sal {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter salary: ");
        Float s=in.nextFloat();
        if(s>25000){
            s=(s+s/10)+1000;
        } else{
            s=(s+s/8)+500;
        }
        System.out.println("salary is: "+s);
    }
}
