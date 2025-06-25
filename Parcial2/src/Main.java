
public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja();
        caja.cobrar("efectivo", 5000);
        caja.cobrar("tarjeta", 12000);
        caja.cobrar("billetera", 8300);
    }
}