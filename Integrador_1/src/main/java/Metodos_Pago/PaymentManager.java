package Metodos_Pago;

public class PaymentManager {
    public void processPayment(double amount, String provider) {
        PaymentGateway gateway;
        if ("2".equals(provider)) {
            gateway = new PaypalPaymentGateway();
        } else if ("1".equals(provider)) {
            gateway = new MercadoPagoPaymentGateway();
        } else {
            throw new IllegalArgumentException("Proveedor de pagos no válido.");
        }

        PaymentProcessor processor;
        if ("2".equals(provider)) {
            processor = new PaypalPaymentProcessor(gateway);
        } else if ("1".equals(provider)) {
            processor = new MercadoPagoPaymentProcessor(gateway);
        } else {
            throw new IllegalArgumentException("Proveedor de pagos no válido.");
        }

        processor.processPayment();
    }
}
