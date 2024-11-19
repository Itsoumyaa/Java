import java.util.*;
public class QuadraticEquationRoots {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Quadratic equation is in the form ax^2+bx+c");
        System.out.println("enter a: ");
        double a= sc.nextDouble();
        System.out.println("enter b: ");
        double b= sc.nextDouble();
        System.out.println("enter c: ");
        double c= sc.nextDouble();
            double d = (b * b) - (4 * a * c);
        if(d>=0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("roots are: " + x1 + " " + x2);
        }else{
            System.out.println("roots are not real.");
        }
    }
}
