import java.util.*;
public class WrapperClasses {
    public static void main(String[] args) {
        Double d1= Double.valueOf(11.5);
        Double d2= Double.valueOf(10.5);
        Integer i1=Integer.valueOf(11);
        Integer i2=Integer.valueOf(10);

        // addition using wrraper classes
        double res=d1.doubleValue()+d2.doubleValue();
        int res2=i1.intValue()+i2.intValue();
        System.out.println("Double addition: "+res);
        System.out.println("Integer addition: "+res2);
    }
}
