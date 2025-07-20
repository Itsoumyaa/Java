package Sorting;

public class CountSort {
    static void csort(int[] arr){
        // find the largest element in the array.
        int max=findmax(arr);
        int[] count=new int[max+1]; // 1 3 3 2 5 so here max is 5 toh hum 6 size ka array banaege joh 0 to 5 ke saare elements ki frequency store krega
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++; // meaning count array mei index will be the values of arr and un indices pr joh value store ho rhi h woh uss particular element ka count h
        }
        int k=0;
        for(int i=0;i< count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
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
