import java.util.Scanner;

public class Result2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter no. of subjects: ");
        int n = in.nextInt();
        System.out.println("enter subjects: ");
        String[] s = new String[n];
        for(int i=0;i<n;i++){
             s[i]=in.next();
        }
        System.out.println("enter marks: ");
        float marks;
        float total=0;
        for(int i=0;i<n;i++){
            System.out.println(s[i]+": ");
             marks=in.nextFloat();
              total += marks;
        }
        System.out.println("total marks: "+total);
        float per= total/n;
        System.out.println("percentage: "+per+"%");
        if(per>90 && per<=100){
            System.out.println("A+");
        } else if (per>80 && per<=90) {
            System.out.println("A");
        } else if (per>70 && per<=80) {
            System.out.println("B+");
        }else if(per>=60 && per<=70){
            System.out.println("B");
        }
        else{
            System.out.println("Fail");
        }

    }
}
