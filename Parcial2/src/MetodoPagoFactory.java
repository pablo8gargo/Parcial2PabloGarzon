import metodosPago.MetodoPago;
import metodosPago.PagoBilleteraDigital;
import metodosPago.PagoEfectivo;
import metodosPago.PagoTarjeta;

public class MetodoPagoFactory {
    public static MetodoPago obtenerMetodoPago(String tipo) {

        switch (tipo.toLowerCase()) {
            case "efectivo":
                return new PagoEfectivo();
            case "tarjeta":
                return new PagoTarjeta();
            case "billetera":
                return new PagoBilleteraDigital();
            default:
                return null; 
        }
    }
}
