import java.util.*;

public class ListInterface {
    static void ArrayListExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // 1 2 3
        System.out.println(l.get(1)); // we will get 2 cuz its at index 1
        l.set(1,10);
        System.out.println(l); //1 10 3
        System.out.println(l.contains(10)); // true
    }
    static void LinkedListExamples(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // 1 2 3
        System.out.println(l.get(1)); // we will get 2 cuz its at index 1
        l.set(1,10);
        System.out.println(l); //1 10 3
        System.out.println(l.contains(10)); // true
    }
    // both linked list and array list methods are same
    static void StackExamples(){
        Stack<String> st= new Stack<>();
        st.push("soumya");
        st.push("khandelwal");
        System.out.println(st);
        System.out.println(st.peek()); // return tops of the stack so it will return khandelwal
        System.out.println(st.pop()); // will remove khandelwal
        System.out.println(st.peek()); // soumya
        System.out.println(st.size());//1
        System.out.println(st.empty()); //false
        st.clear(); // empties the stack
        System.out.println(st);
    }
    public static void main(String[] args) {
        ArrayListExamples();
        StackExamples();

    }
}
