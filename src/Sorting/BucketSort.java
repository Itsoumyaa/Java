package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void bsort(int[] arr){
        int n=arr.length;
        // find max value
        int max = arr[0];
        for (int val : arr) {
            max = Math.max(max, val);
        }
        // buckets
        ArrayList<Integer>[] buckets= new ArrayList[n]; // arraylist ka array banaya h
        // create empty buckets
        for(int i=0;i<n;i++){
            buckets[i]= new ArrayList<Integer>(); // so bucket toh bana di lekin uske andr bhi elements store honge toh isliye har bucket ka arraylist banaya h
        }
        // add elements into buckets
        for(int i=0;i<n;i++){
            int bucidx=(arr[i]*n)/(max+1);
            buckets[bucidx].add(arr[i]);
        }
        //sort each bucket individually
        for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }
        // merge all buckets to get final sorted array
        int idx=0;
        for(int i=0;i<buckets.length;i++){
            ArrayList<Integer> curr= buckets[i];
            for(int j=0;j<curr.size();j++){
                arr[idx++]=curr.get(j);
            }
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={12,13,4,32,2,5,6,78,2,50,3};
        bsort(arr);
        display(arr);
    }
}
