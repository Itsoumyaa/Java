import java.util.*;
public class Pascal {
   static int[][] generate(int n){
          int[][] ans=new int[n][];
          for(int i=0;i<n;i++){
              ans[i]= new int[i+1];// i row has i+1 cols.
              ans[i][0]=ans[i][i]=1; // 1st and last ele of each row=1.
              for(int j=1;j<i;j++){
                  ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
              }
          } return ans;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n= sc.nextInt();
         int[][] ans=generate(n);
         for(int i=0;i<n;i++){
             for(int j=0;j<ans[i].length;j++){
                 System.out.print(ans[i][j]);
             }
             System.out.println();
         }
    }
}
