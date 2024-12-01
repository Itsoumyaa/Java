import java.util.*;
public class SecondMaximum {
    static int getLargestidx(int[] arr){
        int n=arr.length;
        int max= Integer.MIN_VALUE;
        int maxidx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                maxidx=i;
            }
        } return maxidx;
    }
    static int secondLargest(int[] arr){
        int n=arr.length;
        int Maxidx = getLargestidx(arr);
        int MaxEle=arr[Maxidx];
        for(int i=0;i<n;i++){
            if(arr[i]==MaxEle){
                arr[i]=-1;
            }
        }
        int secondMaxidx=getLargestidx(arr);
        return arr[secondMaxidx];
    }
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
        System.out.println(secondLargest(arr));

    }
}