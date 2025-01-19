public class PrintArrayUsingRecursion {
    static int printArray(int[] arr, int i){
        if(i==arr.length){
            return 0;
        }
        System.out.println(arr[i]);
        return printArray(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr={16,23,13,4,55};
        printArray(arr,0);

    }
}
