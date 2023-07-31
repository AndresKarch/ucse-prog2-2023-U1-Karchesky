package Metodos_Pago;

public class MercadoPagoPaymentGateway implements PaymentGateway{
    public void authorize() {
        // en esta parte se conectaria con el proveedor de mercadopago correspondiente y se acreditaria el pago
        System.out.println("Autorizando el pago con MercadoPago...");
    }

    @Override
    public void capture() {
        // Lo mismo que en el caso anterior pero para la captura del pago
        System.out.println("Capturando el pago con MercadoPago...");
    }

}
