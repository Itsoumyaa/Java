package Sorting;

public class CountSort2 {
    public static void csort(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        int max=findmax(arr);
        int[] count= new int[max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        // make prefix sum array of count array.
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        // find the index of each element in original array and put it in output array.
        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
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
        int[] arr={5,5,1,4,3,2,3,6,2,1};
        csort(arr);
        display(arr);
    }
}
