package metodosPago;

public class PagoEfectivo implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago en efectivo por $" + monto + ". Verificando y entregando cambio..." );
    }
}
