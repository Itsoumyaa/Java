import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
        //HashSet<Integer> st=new HashSet<>(); MOST EFFICIENT
        //LinkedHashSet<Integer> st=new LinkedHashSet<>(); // 2ND MOST EFFICIENT isme jiss order mei add kroge usi order mei set show krega like here it will be 1 2 3 48 10 15
        TreeSet<Integer> st=new TreeSet<>(); // LEAST EFFICIENT yeh sorted increaing order mei elements show krega like 1 2 3 10 15 48
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(10);
        st.add(15);
        System.out.println(st); // so yeh set kisi bhi order mei print ho skta h
        st.add(1);
        System.out.println(st); // 1 2 3 and not 1 1 2 3 bcoz set is known for uniqueness
        st.remove(2); // removes 2
        System.out.println(st);
        System.out.println(st.contains(2)); // false
        System.out.println(st.size()); // 2
    }
}
