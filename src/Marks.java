import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Marks out of 100");
        System.out.println("Phy: ");
        float p= sc.nextFloat();
        System.out.println("Chem: ");
        float c= sc.nextFloat();
        System.out.println("Maths: ");
        float m= sc.nextFloat();
        float total=(p+c+m)/3;
        if(total<=100 && total>=90){
            System.out.println("A+");
        }
        else if(total<=89 && total>=80){
            System.out.println("A");
        }
        else if(total<=79 && total>=60){
            System.out.println("B");
        }
        else if(total<=59 && total>=40){
            System.out.println("C");
        }
        else{
            System.out.println("FAIL");
        }

    }

}
