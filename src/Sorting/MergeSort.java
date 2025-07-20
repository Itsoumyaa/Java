package Sorting;

public class MergeSort {
    public static void mergesort(int[] arr, int l, int r){
        int mid=(l+r)/2;
        if(l>=r){
            return;
        }
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void merge(int[] arr, int l, int mid, int r){
        int n1=mid-l+1; // size of left array
        int n2 = r-mid; // size of right array
        int[] left= new int[n1];
        int[] right= new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }

        }
        while(i<n1){ // agar i peeche rehe gya mtlb j reached n1 toh i ke bache hue elements copy kro
            arr[k++]=left[i++];
        }
        while(j<n2){// agar j peeche rehe gya mtlb i reached n2 toh j ke bache hue elements copy kro
            arr[k++]=right[j++];
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
        mergesort(arr,0,arr.length-1);
        display(arr);
    }
}
