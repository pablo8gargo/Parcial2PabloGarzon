import metodosPago.MetodoPago;

public class Caja {
    public void cobrar(String tipo, double monto) {
        MetodoPago metodo = MetodoPagoFactory.obtenerMetodoPago(tipo);
        if (metodo != null) {
            metodo.procesarPago(monto);
        } else {
            System.out.println("Metodo de pago '" + tipo + "' no soportado");
        }
    }
}

