public class FrogJump {
    static int ans(int[] h, int n, int idx){
        if(idx==n-1){
            return 0;
        }
        int res1= Math.abs(h[idx]-h[idx+1]) + ans(h,n,idx+1);
        if(idx==n-2){
            return res1;
        }
        int res2= Math.abs(h[idx]-h[idx+2]) + ans(h,n,idx+2);
        return Math.min(res1,res2);
    }

    public static void main(String[] args) {
        int[] h={10,30,40,20};
        System.out.println(ans(h,4,0));
    }
}
