import java.util.Scanner;

public class LUcase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n: ");
        char c= in.next().charAt(0);
        if(c>=65 && c<=90){
            System.out.println(c+" is uppercase");
        }
        else if(c>=97 && c<=122){
            System.out.println(c+" is lowercase");
        } else if (c>=48 && c<=57) {
            System.out.println(c+" is an integer");

        }
        else{
            System.out.println("none");
        }
    }
}
