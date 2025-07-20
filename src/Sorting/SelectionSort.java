package Sorting;

public class SelectionSort {
    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){ // n-1 bcoz By the time you reach the second last element (i = n - 2): You only need to compare it with the last element (i + 1 = n - 1). There's only one element left (n-1) & It's already in the correct place after all earlier swaps.
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j; // finding minimum
                }

            }
            if(min!=i){ // avoiding swapping by itself. // swapping with minimum 
                swap(arr,min,i);
            }
        }
    }
    public static void swap(int[] arr , int  i , int  j){
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
