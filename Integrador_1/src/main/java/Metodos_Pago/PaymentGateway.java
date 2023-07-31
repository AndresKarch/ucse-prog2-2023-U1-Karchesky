package Metodos_Pago;

public interface PaymentGateway {
    void authorize();
    void capture();
}
