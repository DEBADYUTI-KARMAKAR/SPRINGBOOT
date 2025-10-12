package payment.ex;

public class Amex implements IPayment{
    @Override
    public boolean processPayment(double billAmount) {
        System.out.println("Amex Payment processed...");
        return false;
    }
}
