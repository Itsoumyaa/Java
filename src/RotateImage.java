import java.util.Scanner;

public class RotateImage {
    public static void rotate(int[][] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp= arr[i][j];
                arr[i][j]=arr[i][n-1-j];
                arr[i][n-1-j]=temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n: ");
        int n= sc.nextInt();
        System.out.println("enter elements of the matrix: ");
        int[][] m= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        rotate(m);
        System.out.println("rotated by 90 degrees: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
