package in.sigma.beans;

public class DebitCard implements IPayment{
    public DebitCard(){
        System.out.println("Debit Card Constructor");
    }
    @Override
    public boolean processPayment(double billAmount) {
        // some logic
        System.out.println("DebitCard Payment successfull....");
        return true;
    }
}
