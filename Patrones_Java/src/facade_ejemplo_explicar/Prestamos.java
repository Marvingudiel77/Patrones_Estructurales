package facade_ejemplo_explicar;

import java.util.Random;

public class Prestamos {

    private int numPrestamo;
    private double montoPrestamo;
    private double tasaPrestamo;
    Random aleatorio = new Random();

    public Prestamos (double monto, double tasa){
        numPrestamo = aleatorio.nextInt(1001, 9999);
        montoPrestamo = monto;
        tasaPrestamo = tasa;
    }
    //único método donde solo imprime
    public void AprobarPrestamo(){
        System.out.println("***Prestamo aprobado:***\n" +
                "Numero prestamo:" + numPrestamo + "\n" +
                "Monto: " + montoPrestamo + "\n" +
                "Tasa: " + tasaPrestamo + "%");

    }

}
