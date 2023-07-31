package Metodos_Pago;

public class MercadoPagoPaymentProcessor extends PaymentProcessor{
    public MercadoPagoPaymentProcessor(PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    public void processPayment() {
        gateway.authorize();
        gateway.capture();
    }

    @Override
    public void refundPayment() {
        //En este metodo se encontraria la funcion de reembolso de los metodos de pago
    }
}
