package Sorting;

public class ArrangeFruitsUsingSelectionSort {
    public static void sort(String[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[min])<0){
                    min=j;
                }
            }if(min!=i){
                swap(arr,min,i);
            }
        }
    }
    public static void swap(String[] arr , int  i , int  j){
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void display(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        String[] fr={"kiwi","apple","banana","papaya"};
        sort(fr);
        display(fr);
    }
}
