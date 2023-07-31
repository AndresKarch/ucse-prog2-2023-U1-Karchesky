package Metodos_Pago;

public class PaypalPaymentGateway implements PaymentGateway{
    public void authorize() {
        // en esta parte se conectaria con el proveedor de paypal correspondiente y se acreditaria el pago
        System.out.println("Autorizando el pago con PayPal...");
    }

    @Override
    public void capture() {
        // Lo mismo que en el caso anterior pero para la captura del pago
        System.out.println("Capturando el pago con PayPal...");
    }
}
