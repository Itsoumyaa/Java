import java.awt.*;
import java.util.*;
public class RestaurantMenuEnums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0.0;
        System.out.println("WELCOME TO OUR RESTAURANT!!!");
        System.out.println("**---MENU---**");
        // displaying the menu items
        for(Menu item: Menu.values()){
            System.out.printf("%s: %s - Rs %.2f%n", item.getCategory(),item.name(),item.getPrice());
        }
        System.out.println("\n Enter the items you want to order (type DONE to finish) : ");
        while(true){
            String input= sc.nextLine().toUpperCase();
            if(input.equals("DONE")){
                System.out.println("Thank You!!");
                break;
            }
            try{
                Menu selected = Menu.valueOf(input);
                total+=selected.getPrice();
                System.out.printf("%s added to your order. Current total: Rs %.2f%n",selected.name(),total);
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                System.out.println("Enter correct item!");
            }
            System.out.printf("Total bill: Rs %.2f%n",total);
        }
    }
    enum MenuCategory{
        APPETIZER,
        MAIN_COURSE,
        DESSERT,
        BEVERAGES;
    }
    enum Menu{
            SPRINGROLLS(MenuCategory.APPETIZER,400),
            HONEYCHILLIPOTATO(MenuCategory.APPETIZER,400),
            PANEERTIKKA(MenuCategory.APPETIZER,450),
            BUTTERPANEERMASALA(MenuCategory.MAIN_COURSE,500),
            CHAPATI(MenuCategory.MAIN_COURSE,12),
            ICECREAM(MenuCategory.DESSERT,200),
            BROWNIE(MenuCategory.DESSERT,300),
            CHEESECAKE(MenuCategory.DESSERT,400),
            COLDCOFFEE(MenuCategory.BEVERAGES,350),
            BLUELAGOON(MenuCategory.BEVERAGES,250),
            CHOCOLATESHAKE(MenuCategory.BEVERAGES,300);
            private final MenuCategory category;
            private final double price;

            Menu(MenuCategory category, double price){
                this.category=category;
                this.price=price;
            }
            public MenuCategory getCategory(){
                return category;
            }
            public double getPrice(){
            return price;
        }
    }
}
