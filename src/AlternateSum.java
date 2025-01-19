public class AlternateSum {
    static int AlternateSUM(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return AlternateSUM(n-1)-n;
        } else{
            return AlternateSUM(n-1)+n;
        }
    }

    public static void main(String[] args) {
        System.out.println(AlternateSUM(5));
    }
}
