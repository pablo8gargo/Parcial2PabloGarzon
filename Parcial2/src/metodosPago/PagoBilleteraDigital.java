package metodosPago;

public class PagoBilleteraDigital implements MetodoPago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con billetera digital por $" + monto + ". Verificando saldo y procesando transacción...");
    }
}
