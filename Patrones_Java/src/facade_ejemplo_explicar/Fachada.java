package facade_ejemplo_explicar;

import java.util.Scanner;
public class Fachada {
    Scanner scanner = new Scanner(System.in);
    //Asociamos una clase con otra
    //variables de referencia
    private Prestamos presta;
    private Cuentas cuenta;
    private Tarjetas tarjeta;


    public void OperacionessPrestamos(){
        System.out.println("*****SOLICITUD DE PRESTAMO*****");
        System.out.println("Digite el monto:");
        double monto = scanner.nextDouble();
        System.out.println("Digite la tasa: ");
        double tasa = scanner.nextDouble();
        //esta variable se convierte en un objeto
        presta = new Prestamos(monto, tasa);
        //llama al metodo
        presta.AprobarPrestamo();// Llama al método AprobarPrestamo del objeto presta para mostrar la información del préstamo aprobado.

    }

    public void OperacionesCuentas(){
        double balance;

        System.out.println("Digite su Número de cuenta:");
        int num = scanner.nextInt();
        cuenta = new Cuentas(num); // Crea un nuevo objeto Cuentas con el número de cuenta proporcionado e inicializa la variable cuenta.
        System.out.println("[1]Deposito     [2]Retiro");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Digite el monto: ");
            double monto = scanner.nextDouble();
            balance = cuenta.Depositar(monto);//Se accede al metodo de la clase cuenta
            System.out.println("Su balance es : " + balance);

        }
        else{
            System.out.println("Digite el monto: ");
            double monto = scanner.nextDouble();
            balance = cuenta.Retirar(monto); //Se accede al otro metodo
            System.out.println("Su balance es : " + balance);

        }

    }
    public void OperacionesTarjetas()  {
        double monto;

        System.out.println("Digite el número de la tarjeta: ");
        int num = scanner.nextInt();
        tarjeta = new Tarjetas(num); //Creamos el objeto tarjeta
        System.out.println("Cuanto va a pagar: ");
        monto = scanner.nextDouble();
        tarjeta.Pagar(monto); //Usamos la funcionalidad de la tarjeta

    }
}