import java.util.*;
 class BankAcc {
    protected double balance;
    public BankAcc(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposited: $"+amount);
        } else{
            System.out.println("Deposited amount must be positive!");
        }
    }
    public void deposit(double amount,String message){
        if(amount>0){
            balance+=amount;
            System.out.println("deposited: $"+amount+"-"+message);
        } else{
            System.out.println("Deposited amount must be positive!");
        }
    }
    public void showBalance(){
        System.out.println("Current balance: $"+balance);
    }

    
}
class savings extends BankAcc{
    private double interestRate;
    public savings(double balance,double interestRate){
        super(balance);
        this.interestRate=interestRate;
    }
    public void deposit(double amount){
        if(amount>0){
            double interest=(amount*interestRate)/100;
            balance+=(amount+interestRate);
            System.out.println("deposited: $"+amount+" with interest");
        } else{
            System.out.println("amount must be positive");
        }
    }
}
public class BankingSystem{
    public static void main(String[] args) {
        BankAcc bank= new BankAcc(1000);
        bank.showBalance();
        bank.deposit(500);
        bank.deposit(300,"Enjoy!");
        bank.showBalance();
        savings s= new savings(2000,5);
        s.deposit(200);
        s.showBalance();

    }
}
