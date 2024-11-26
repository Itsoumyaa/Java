import java.util.*;
public class DiceCombination {
    static int combo(int n){
        if (n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int x=0;
        for(int i=1;i<=6;i++){
            x+=combo(n-i);
        } return x;
    }
    public static void main(String[] args) {
        System.out.println(combo(3));
    }
}