package metodosPago;

public class PagoTarjeta implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta por $" + monto + ". Confirmando transacción...");
    }
}
