package facade_ejemplo_explicar;

public class Tarjetas {
    private int numTarjeta;

    public Tarjetas(int num) {
        numTarjeta = num;
    }

    public void Pagar(double pago){
        System.out.println("La tarjeta: " + numTarjeta + " ha recibido el pago de " + pago);
    }

    public void AvanceEfectivo(double monto, int cuenta){
        System.out.println("Se han transferito" + monto + "a la cuenta" + cuenta);
    }
}
