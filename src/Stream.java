import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5}; // collection of primitve types
        List<Integer> wrappers= Arrays.stream(arr).boxed().collect(Collectors.toList()); // boxed() is used to convert int to Integer.
        int sum =wrappers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("wrappers: "+wrappers);
        System.out.println("sum: "+sum);

    }
}
