package Sorting;

public class RadixSort {
    public static void rsort(int[] arr){
        int max=findmax(arr);
        //apply counting sort to sort elements based on place value (ones , tens ..)
        for(int place=1; max/place>0; place*=10){
            csort(arr,place);
        }
    }
    public static void csort(int[] arr , int p){
        int n=arr.length;
        int[] output=new int[n];
        int max=findmax(arr);
        int[] count= new int[10];
        for(int i=0;i<n;i++){
            count[(arr[i]/p)%10]++;
        }
        // make prefix sum array of count array.
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        // find the index of each element in original array and put it in output array.
        for(int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/p)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/p)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    public static int findmax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        } return max;
    }

    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={435,56,902,765,657,26};
        rsort(arr);
        display(arr);
    }
}
