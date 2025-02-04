public class LinearSearchUsingRecursion {
    static int LinearSearch(int[] arr, int n, int x, int idx){
        if(idx >= n){ // if idx>=0 then x not found in the array hence return false.
            return -1;
        }
        if(arr[idx]==x){ // if x found then return true.
            return idx;
        }
//        if(LinearSearch(arr,n,x,idx+1)){ // recursive call from idx+1 to n (length of the array).
//            return true;
//        }
//        return false;
        return LinearSearch(arr,n,x,idx+1);
    }
    static void findAllIndices(int[] arr, int n, int x, int idx){
        if(idx>=n){
            return;
        }
        if(arr[idx]==x){
            System.out.println(idx);
        }
        findAllIndices(arr,n,x,idx+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,4,4};
        int n=arr.length;
        System.out.println(LinearSearch(arr,n,47,0));
        findAllIndices(arr,n,4,0);
    }
}
