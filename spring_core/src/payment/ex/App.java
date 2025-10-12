package payment.ex;

public class App {
    public static void main(String[] args) {
        IPayment pay = new Debit();
        PaymentService service = new PaymentService(pay);
        service.setPayment(pay);
        service.doPayment(507.23);


    }
}
