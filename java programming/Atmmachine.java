import java.util.Scanner;
public class Atmmachine {
    public static void main(String[]args){
        System.out.println("Welcome to yeshwanths ATM, Select yes to continue or no to go back");
        Scanner sc=new Scanner(System.in);
        char reply=sc.next().charAt(0);
        if(reply=='y'){
        int attempts=0;
        while(attempts<=5){
        System.out.println("Choose the service you wanna avail\nDeposit\nBalance\nTransfer\nback");
        char serviceChosen = sc.next().charAt(0);
        double account=1000;
        switch(serviceChosen){
            case 'd':
                  double deposit= sc.nextDouble();;
                  account=account+deposit;
                  System.out.println("The current balance is"+account);
                break;
            case 't':
                  double transfer= sc.nextDouble();
                  account=account-transfer;
                  System.out.println("The amount"+transfer+"has been transferred to the account122929292");
                  System.out.println("The current balance is"+account);
                break;
            case 'b':
                 System.out.println(account);
                break;
            case 'w':
                  double withdraw=sc.nextDouble();
                  account=account-withdraw;
                  System.out.println("the money has been withdrawed");
                  System.out.println("The current balance is"+account);
                break;
        }
        attempts=attempts+1;
     
}
    }
    sc.close();
 }}


