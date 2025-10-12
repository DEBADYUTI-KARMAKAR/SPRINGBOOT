package in.sigma.beans;

public class PaymentService {
    private  IPayment c;

    public PaymentService(){
        System.out.println("PaymentService :: Constructor Default");
    }
    public PaymentService(IPayment c){
        System.out.println("PaymentService :: Constructor Parameter");
        this.c = c;
    }

//    public void setC(IPayment c){
//        System.out.println("Setter injection called..");
//        this.c = c;
//    }

    public void doPayment(double billAmount){
        boolean status = c.processPayment(billAmount);
        if(status){
            System.out.println("Payment done!!!!!!  waiting for bill");
        }else{
            System.out.println("Card bounced!!!");
        }
    }

}
