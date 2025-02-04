import java.lang.reflect.Array;
import java.util.ArrayList;

public class DoesTheDigitDivide {
    static ArrayList<Integer> divide(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        answer(n, ans);
        return ans;
    }
    static void answer(int n, ArrayList<Integer> ans){
        if(n==0){
            return;
        }
        int x=n%10;
        if(x!=0 && n%x==0){
            ans.add(x);
        }
        answer(n/10,ans);

    }

    public static void main(String[] args) {
        System.out.println(divide(500));
    }
}
