import java.util.*;

abstract class Shapes{
    abstract void area();
}
class Circle extends Shapes{
    public void area(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter radius: ");
        float r= sc.nextFloat();
        float ar = 3.14f*r*r;
        System.out.println(ar);
    }
}
class Rectangle extends Shapes{
    public void area(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length and breadth : ");
        float l= sc.nextFloat();
        float b= sc.nextFloat();
        float ar= l*b;
        System.out.println(ar);
    }
}
public class AbstractClasses {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter shape: ");
        String shape= sc.nextLine();
        if(shape.equals("circle")){
            Circle c=new Circle();
            c.area();
        }
        if(shape.equals("rectangle")){
            Rectangle r =new Rectangle();
            r.area();
        }

    }
}
