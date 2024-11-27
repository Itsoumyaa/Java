import java.util.*;
public class AllZeroToEnd {
   static void pushZerosToEnd(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                } j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,0,4,0,5,0,6,0,};
        pushZerosToEnd(arr);
    }
}
