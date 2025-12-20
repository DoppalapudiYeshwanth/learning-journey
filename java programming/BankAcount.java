import java.util.Scanner;

public class BankAcount {
    public static void main(String[]args){
        BankAccount a=new BankAccount();
        a.deposit(1200);
        a.withdraw(200);
        a.balance();

    }
}
class BankAccount{
    int accountNumber;
    double balance;
    public void deposit(double deposit){
        balance += deposit;
        System.out.println("Deposited: $" + deposit);
        System.out.println("New Balance: $" + balance);
    }
    public void withdraw(double withdraw){
        if(withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Withdrawn: $" + withdraw);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
    public void balance(){
        System.out.println("Current Balance: $" + balance);
    }
}