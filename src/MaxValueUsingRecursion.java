public class MaxValueUsingRecursion {
    static int MaxValue(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallAns=MaxValue(arr,idx+1);
        return Math.max(smallAns,arr[idx]);

    }
    static int sum(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        return arr[idx]+sum(arr,idx+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println("Max value is: "+MaxValue(arr,0));
        System.out.println("sum is: "+sum(arr,0));
    }
}
