package payment.ex;

public class PaymentService {
    private IPayment payment;
    public void setPayment(IPayment payment){
        this.payment = payment;
    }
    public PaymentService(IPayment payment){
        this.payment = payment;
    }

    public void doPayment(double billAmount){
        boolean status = payment.processPayment(billAmount);
        if(status){
            System.out.println("Payment Success....");
        }else {
            System.out.println("Payment Declined...");
        }
    }
}
