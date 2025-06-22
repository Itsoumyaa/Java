package Array;

public class MaxSubarraySum {
    public static void maxSubArray(int[] nums){
        int sum=0,s=0,e=0,start=0;
        int max= Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
                s=start;
                e=i;
            } if(sum<0){
                sum=0;
                start=i+1;
            }
        }
        for(int i=s;i<=e;i++){
            System.out.print(nums[i]+" ");
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(arr);
    }
}

