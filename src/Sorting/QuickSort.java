package Sorting;

public class QuickSort {
    public static void quicksort(int[] arr , int s , int e){
        if(s>=e) return;
        int pi=partition(arr,s,e);
        quicksort(arr,s,pi-1);
        quicksort(arr,pi+1,e);
    }
    public static int partition(int[] arr, int s, int e){
        int pi=arr[s];
        int less=0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pi) {
                less++;
            }
        }
        int pidx=s+less;
        swap(arr,s,pidx);
        int i=s;
        int j=e;
        while(i<pidx && j>pidx){
            while(arr[i]<=pi) i++;
            while(arr[j]>pi) j--;
            if(i < pidx && j>pidx){ // condition where arr[i] is greater than pivot and arr[j] is smaller than pivot but we didnt write it in if condition because it wasnt
                swap(arr,i,j);    // needed as upar ke while loops already count kr rhe unko joh sahi h toh if situation becomes kind of else and humne isme normally swap
                 i++;        // kr diya kyoki iski joh opposite condition h woh while loops dekh rhe andr ke.
                j--;
            }

        }
        return pidx;
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
        int[] arr={5,1,2,4,6,3,8,9,34,56};
        quicksort(arr,0,arr.length-1);
        display(arr);
    }
}
