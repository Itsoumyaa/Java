import java.util.*;
public class StringtoInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("enter a string: ");
            String s = sc.nextLine();
            int i = 0;
            int sign = 1;
            int res = 0;
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            if (i < s.length() && ((s.charAt(i) == '-') || (s.charAt(i) == '+'))) {
                if (s.charAt(i) == '-') {
                    sign = -1;
                }
                i++;
            }
            if(i>=s.length() || !Character.isDigit(s.charAt(i))){
                throw new IllegalArgumentException("Invalid input: String does not start with a valid number.");
            }

            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';
                if(res>(Integer.MAX_VALUE-digit)/10){
                    throw new ArithmeticException("Integer Overflow");
                }
                res = res * 10 + digit;
                i++;
            } if(i < s.length() && !Character.isDigit(s.charAt(i))){
                throw new IllegalArgumentException("Invalid input: Contains non-numeric characters.");
            }

            System.out.println("Converted integer: "+(res*sign));
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("An unexpected error occurred");
        }
    }
}
