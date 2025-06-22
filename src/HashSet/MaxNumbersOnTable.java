package HashSet;

import java.util.HashSet;

public class MaxNumbersOnTable {
    static int maxNumbers(int[] arr){
        HashSet<Integer> table= new HashSet<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(table.contains(num)){
                table.remove(num);
            }else{
                table.add(num);
                max=Math.max(max, table.size());
            }
        } return max;
    }
    public static void main(String[] args) {
        int[] arr={2,1,1,3,2,3};
        System.out.println(maxNumbers(arr));
    }
}
