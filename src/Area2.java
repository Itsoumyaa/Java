import java.util.*;
public class Area2 {
    static double circle(double r){
        double area= Math.PI* Math.pow(r,2);
        return area;
    }
    static float rectangle(float l,float b){
        float area=l*b;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius: ");
        double r= sc.nextDouble();
        System.out.println("area of circle: "+ circle(r));
        System.out.println("enter length and breadth: ");
        float l= sc.nextFloat();
        float b= sc.nextFloat();
        System.out.println("area of rectangle: "+ rectangle(l,b));
    }
}
