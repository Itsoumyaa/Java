package Sorting;

public class RecursiveBubbleSort {
    public static void sort(int[] arr, int n){
        if(n==1) return;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }
        } sort(arr,n-1);
    }
    public static void swap(int[]arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={5,1,2,4};
        sort(arr,arr.length);
        display(arr);
    }
}
