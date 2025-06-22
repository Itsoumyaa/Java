package Sorting;

public class BubbleSort {
    public static void sort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            boolean isSwapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    isSwapped=true;
                }
            } if(!isSwapped) break;
        }
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
        sort(arr);
        display(arr);
    }
}
