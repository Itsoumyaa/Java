import java.util.*;
interface Dessert{
    void dessert();
}
interface Food{
    void food();
}
 class Dinner implements Dessert,Food{
    public void food(){
        System.out.println("Burger");
    }

    @Override
    public void dessert() {
        System.out.println("Ice Cream");
    }
}
public class InterfacesMultipleInheritance {
    public static void main(String[] args) {
        Dinner d=new Dinner();
        d.food();
        d.dessert();
    }
}
