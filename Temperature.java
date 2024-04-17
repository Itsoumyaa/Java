import java.util.Scanner;

public class Temperature {
    static void F(float c){
        float f=(c*9/5)+32;
        System.out.println(f);
        return;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter temperature in celsius: ");
        float c= in.nextFloat();
        System.out.println("temperature in fahrenheit: ");
        F(c);
    }
}
