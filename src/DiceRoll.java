import java.util.*;

public class DiceRoll {
    public static void main(String[] args) {
        int i = 0;
        int min = 1;
        int max = 6;
        int range = max - min + 1;
        Scanner sc = new Scanner(System.in);
        while (i != 10) {
            System.out.println("type roll: ");
            String s = sc.nextLine();
            while (!s.equals("roll")) {
                System.out.println("Invalid input. Try again.");
                System.out.println("type roll: ");
                s = sc.nextLine();
            }
            int r = (int) (Math.random() * range) + min;
            System.out.println(r);
            i++;
        }
    }
}
