package in.sigma.beans;

public class AmexCard implements IPayment{
    public AmexCard(){
        System.out.println("Amex Card Constructor");
    }
    @Override
    public boolean processPayment(double billAmount) {
        System.out.println("Payment successful from Amex card");
        return true;
    }
}
