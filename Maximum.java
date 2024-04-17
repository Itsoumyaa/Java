import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter n1: ");
        float n1=in.nextFloat();
        System.out.println("enter n2: ");
        float n2=in.nextFloat();
        if(n1>n2){
            System.out.println(n1+" is greater");
        } else{
            System.out.println(n2+" is greater");
        }
    }
}
