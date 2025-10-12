package payment.ex;

public class Debit implements IPayment{
    public boolean processPayment(double billPayment){
        // logic........
        System.out.println("Debit Card Payment Processed...");
        return true;
    }
}
