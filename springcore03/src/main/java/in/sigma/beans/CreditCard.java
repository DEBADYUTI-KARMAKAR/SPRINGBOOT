package in.sigma.beans;

public class CreditCard implements IPayment{
    public CreditCard(){
        System.out.println("Credit Card Constructor");
    }
    @Override
    public boolean processPayment(double billAmount) {
        // logic
        System.out.println("Payment from CreditCard");
        return true;
    }
}
