package Sorting;

public class RecursiveInsertionSort {
    public static void sort(int[] arr ,  int n){
        if(n<=1) return;
        sort(arr,n-1);
        int last=arr[n-1];
        int j=n-2;
        while(j>=0 && arr[j]>last){
            arr[j+1]=arr[j];
            j--;
        } arr[j+1]=last;
    }
    public static void swap(int[] arr , int  i , int  j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr={5,1,2,4,3,8,9};
        sort(arr,arr.length);
        display(arr);
    }
}
