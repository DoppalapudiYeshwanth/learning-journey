public class PaymentMethod {
    public static void main(String[] args) {
        Paymentmethod payment = new Paymentmethod();
        payment.pay(1234-5678-9876-5432); // Credit Card
        payment.pay(100); // Cash
        payment.pay("Bank of America", "123456789"); // Bank Transfer
    }
}
class Paymentmethod{
    public void pay(int creditCard){
        System.out.println("Payment method is credit card: " + creditCard);
    }
    public void pay(double cash){
        System.out.println("Payment method is cash : " + cash);
    }
    public void pay(String bankName, String accountNumber){
        System.out.println("Payment method is Bank Transfer: " + bankName + ", Account Number: " + accountNumber);
    }
}