package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MaxFreqElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,2,2,5,5};
        Map<Integer,Integer> freq= new HashMap<>();
        for(int el: arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            } else{
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println(freq.entrySet());
        int mxfreq=0;
        int anskey=-1;
        // WAY -1
//        for(var e: freq.entrySet()){
//            if(e.getValue()>mxfreq){
//                mxfreq=e.getValue();
//                anskey=e.getKey();
//            }
//        }
        // WAY -2
        for(var keys: freq.keySet()){
            if(freq.get(keys) > mxfreq){
                mxfreq=freq.get(keys);
                anskey=keys;
            }
        }
        System.out.printf("%d has max freq of %d times",anskey,mxfreq);
    }
}
