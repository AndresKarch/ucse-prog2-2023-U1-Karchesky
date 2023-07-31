package Metodos_Pago;

public class PaymentProcessor {
    protected PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void processPayment() {

    }

    public void refundPayment() {

    }
}
