import java.util.*;
public class Area {
    static float circle(float r){
        float pi=3.14f;
        float area=pi*r*r;
        return area;
    }
    static float rectangle(float l,float b){
        float area=l*b;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius: ");
        float r= sc.nextInt();
        System.out.println("area of circle: "+ circle(r));
        System.out.println("enter length and breadth: ");
        float l= sc.nextInt();
        float b= sc.nextInt();
        System.out.println("area of rectangle: "+ rectangle(l,b));
    }
}
