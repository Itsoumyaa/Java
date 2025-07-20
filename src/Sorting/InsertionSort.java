package Sorting;

public class InsertionSort {
    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){ // i=1 se start kiyaa kyoki in this we assume that the first element is sorted.
            int j=i;
            while( j> 0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
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
        sort(arr);
        display(arr);
    }
}
