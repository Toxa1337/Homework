package task26;

public class Choice {
    Pay payment;

    public void setPay(Pay payment){
        this.payment = payment;
    }

    public void executePay(){
        payment.pay();
    }
}