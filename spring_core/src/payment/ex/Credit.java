package payment.ex;

public class Credit implements IPayment{
    @Override
    public boolean processPayment(double billAmount) {
        System.out.println("Credit Payment Processed...");
        return false;
    }
}
